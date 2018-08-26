// DLLs -> http://indy.fulgan.com/SSL/Archive/indy_OpenSSL096m.zip (Compativel com Indy 9 do Delphi 7)
// SSL -> SSL (Protocolo de Camada de Sockets Segura).
//        São protocolos criptográficos que conferem segurança de comunicação na Internet para serviços como email (SMTP),
//        navegação por páginas (HTTP) e outros tipos de transferência de dados.

unit email;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls, ExtCtrls, ComCtrls, IdBaseComponent, IdMessage,
  IdComponent, IdTCPConnection, IdTCPClient, IdMessageClient, IdSMTP,
  IdIOHandler, IdIOHandlerSocket, IdSSLOpenSSL, IdMailBox, IdPOP3, DB,
  Grids, DBGrids, DBClient, IdCoder, IdCoder3to4, IdCoderMIME;

type
  TfSendMail = class(TForm)
    pcPaginas: TPageControl;
    tsEmail: TTabSheet;
    tsRemetente: TTabSheet;
    Bevel1: TBevel;
    Label1: TLabel;
    Label2: TLabel;
    Label3: TLabel;
    edPara: TEdit;
    edAssunto: TEdit;
    lbxAnexos: TListBox;
    Label4: TLabel;
    mmMensagem: TMemo;
    btnAnexar: TButton;
    btnEnviar: TButton;
    btnFechar: TButton;
    btnLimpar: TButton;
    Bevel2: TBevel;
    Bevel3: TBevel;
    Bevel4: TBevel;
    odAnexos: TOpenDialog;
    IdMessage: TIdMessage;
    IdSMTP: TIdSMTP;
    Label5: TLabel;
    edNomeRemetente: TEdit;
    Label6: TLabel;
    edEmailRemetente: TEdit;
    Label7: TLabel;
    edSMTP: TEdit;
    Label8: TLabel;
    edUserName: TEdit;
    Label9: TLabel;
    edPassword: TEdit;
    SSLSocket: TIdSSLIOHandlerSocket;
    cbSSL: TCheckBox;
    Label10: TLabel;
    edPorta: TEdit;
    cbAutentica: TCheckBox;
    lbMensagem: TLabel;
    tsEntrada: TTabSheet;
    Bevel5: TBevel;
    btnReceber: TButton;
    IdPOP31: TIdPOP3;
    IdMessagePOP3: TIdMessage;
    lbMensagemPOP: TLabel;
    Label11: TLabel;
    edFrom: TEdit;
    Label12: TLabel;
    edSubject: TEdit;
    Label13: TLabel;
    mmMensagemRecebida: TMemo;
    btnProximo: TButton;
    Label14: TLabel;
    lbTotalMensagensRecebidas: TLabel;
    btnAnterior: TButton;
    btnDesconectaPOP3: TButton;
    Label15: TLabel;
    edPortaPOP3: TEdit;
    Label16: TLabel;
    edPOP3: TEdit;
    procedure btnAnexarClick(Sender: TObject);
    procedure btnFecharClick(Sender: TObject);
    procedure btnEnviarClick(Sender: TObject);
    procedure btnLimparClick(Sender: TObject);
    procedure btnReceberClick(Sender: TObject);
    procedure btnProximoClick(Sender: TObject);
    procedure btnAnteriorClick(Sender: TObject);
    procedure btnDesconectaPOP3Click(Sender: TObject);
    procedure FormClose(Sender: TObject; var Action: TCloseAction);
  private
    { Private declarations }
    MensagemIndice: Integer;

    Procedure CarregaMensagem(IdMensagem: Integer);
    Procedure LimpaRecebidos;
  public
    { Public declarations }
  end;

var
  fSendMail: TfSendMail;

implementation

uses IdEMailAddress;

{$R *.dfm}

procedure TfSendMail.btnAnexarClick(Sender: TObject);
begin
  if odAnexos.Execute then
    lbxAnexos.Items.Add(odAnexos.FileName);
end;

procedure TfSendMail.btnFecharClick(Sender: TObject);
begin
  Application.Terminate;
end;

procedure TfSendMail.btnEnviarClick(Sender: TObject);
var
  Anexo: Integer;
begin
  // Configuração do Remetente
  if cbAutentica.Checked then
    IdSMTP.AuthenticationType := atLogin
  else
    IdSMTP.AuthenticationType := atNone;

  IdSMTP.Host := edSMTP.Text;
  IdSMTP.Username := edUserName.Text;
  IdSMTP.Password := edPassword.Text;
  IdSMTP.Port := StrToIntDef(edPorta.Text,465);

  if cbSSL.Checked then
  begin
    IdSMTP.IOHandler := SSLSocket;
    SSLSocket.SSLOptions.Method := sslvSSLv23;
    SSLSocket.SSLOptions.Mode := sslmClient;
  end;

  // Configuração da Mensagem
  IdMessage.From.Name := edNomeRemetente.Text;
  IdMessage.From.Address := edEmailRemetente.Text;
  IdMessage.Recipients.EMailAddresses := edPara.Text;
  IdMessage.Subject := edAssunto.Text;
  IdMessage.Body.Text := mmMensagem.Lines.Text;

  // confirmação de recebimento
  IdMessage.ReceiptRecipient.Address := edEmailRemetente.Text;
  IdMessage.ReceiptRecipient.Name := edNomeRemetente.Text;
  IdMessage.ReceiptRecipient.Text := IdMessage.From.Text;

  // Anexos
  for Anexo := 0 to lbxAnexos.Items.Count-1 do
    TIdAttachment.Create(idmessage.MessageParts, TFileName(lbxAnexos.Items.Strings[Anexo]));

  // Envio E-mail
  try
    try
      lbMensagem.Font.Color := clGreen;
      lbMensagem.Caption := 'Conectando...';
      Repaint;
      IdSMTP.Connect;
      lbMensagem.Caption := 'Enviando...';
      Repaint;
      IdSMTP.Send(IdMessage);
    except on e: Exception do
      begin
        lbMensagem.Font.Color := clRed;
        lbMensagem.Caption := 'E-mail não enviado!';
        Showmessage('Não foi possível enviar o e-mail. ' + #10#13 +
                    e.Message);
        Exit;
      end;
    end;
  finally
    IdSMTP.Disconnect;
  end;

  lbMensagem.Font.Color := clGreen;
  lbMensagem.Caption := 'E-mail enviado com Sucesso!';
end;

procedure TfSendMail.btnLimparClick(Sender: TObject);
begin
  edPara.Clear;
  edAssunto.Clear;
  lbxAnexos.Items.Clear;
  mmMensagem.Clear;
  edPara.SetFocus;
  lbMensagem.Font.Color := clGreen;
  lbMensagem.Caption := '...';
end;

procedure TfSendMail.btnReceberClick(Sender: TObject);
begin
  IdPOP31.Host:= edPOP3.Text;
  IdPOP31.Port:= StrToIntDef(edPortaPOP3.Text,995);
  IdPOP31.Username:= edUserName.Text;
  IdPOP31.Password:= edPassword.Text;

  if cbSSL.Checked then
  begin
    IdPOP31.IOHandler:= SSLSocket;
    SSLSocket.SSLOptions.Method:=sslvSSLv23;
    SSLSocket.SSLOptions.Mode:=sslmClient;
  end;

  if Not(IdPOP31.Connected) then
  begin
    lbMensagemPOP.Caption := 'Conectando...';
    Repaint;
    try
      IdPOP31.Connect;
    except on e:Exception do
      begin
        ShowMessage('Não foi possível efetuar a conexão. '+e.Message);
        LimpaRecebidos;
        Exit;
      end;
    end;
  end;

  if IdPOP31.Connected then
    lbMensagemPOP.Caption := 'Conexão POP3 Ok.';
  Repaint;

  if idpop31.CheckMessages > 0 then
  begin
    MensagemIndice := 1;
    CarregaMensagem(MensagemIndice);
  end
  else
  begin
    MensagemIndice := 0;
    lbMensagemPOP.Caption := 'Não há e-mais recebidos no momento.';
    IdPOP31.Disconnect;
  end;
end;

procedure TfSendMail.btnProximoClick(Sender: TObject);
begin
  if Not(IdPOP31.Connected) then
    Exit;

  if (MensagemIndice > 0) and (MensagemIndice < idpop31.CheckMessages) then
    inc(MensagemIndice)
  else
    Exit;

  CarregaMensagem(MensagemIndice);
end;

procedure TfSendMail.CarregaMensagem(IdMensagem: Integer);
var
  i: Integer;
begin
  LimpaRecebidos;
  lbTotalMensagensRecebidas.Caption := FormatFloat('0000',idpop31.CheckMessages);
  Repaint;


  try
    lbMensagemPOP.Caption := 'Recebendo...';
    Repaint;

    IdMessagePOP3.Clear;
    IdMessagePOP3.ContentType := 'text';
    idpop31.Retrieve(IdMensagem, IdMessagePOP3);
    edFrom.Text := IdMessagePOP3.From.Address;
    edSubject.Text := IdMessagePOP3.Subject;

    for i := 0 to IdMessagePOP3.MessageParts.Count-1 do
      if IdMessagePOP3.MessageParts[i] is TIdText then
        mmMensagemRecebida.Lines.AddStrings((IdMessagePOP3.MessageParts[i] as TIdText).Body);

    mmMensagemRecebida.Text := Trim(mmMensagemRecebida.Text);

    lbMensagemPOP.Caption := 'E-mail '+ IntToStr(IdMensagem) + ' recebido.';
    repaint;
  except on e:Exception do
    begin
      lbMensagemPOP.Font.Color := clRed;
      lbMensagemPOP.Caption := 'Erro ao Receber E-mail. '+ e.Message;
      Exit;
    end;
  end;
end;

procedure TfSendMail.LimpaRecebidos;
begin
  edFrom.Clear;
  edSubject.Clear;
  mmMensagemRecebida.Clear;
  lbMensagemPOP.Font.Color := clGreen;
  lbMensagemPOP.Caption := '...';
  lbTotalMensagensRecebidas.Caption := '...';
end;

procedure TfSendMail.btnAnteriorClick(Sender: TObject);
begin
  if Not(IdPOP31.Connected) then
    Exit;

  if (MensagemIndice > 0) and (MensagemIndice <= idpop31.CheckMessages) then
    dec(MensagemIndice)
  else
    Exit;

  CarregaMensagem(MensagemIndice);
end;

procedure TfSendMail.btnDesconectaPOP3Click(Sender: TObject);
begin
  if IdPOP31.Connected then
    IdPOP31.Disconnect;

  LimpaRecebidos;
end;

procedure TfSendMail.FormClose(Sender: TObject; var Action: TCloseAction);
begin
  if IdPOP31.Connected then
    IdPOP31.Disconnect;

  if IdSMTP.Connected then
    IdSMTP.Disconnect;
end;

end.



{
Var
  lMsg: TIdMessage;
  i: Integer;
  iMsgs: Integer;
  sEmail : TStringList;
  sTexto : String;
begin
  //Configurações
  //TIdPOP3
  with POP3 do begin
    IOHandler := IO_OpenSSL;
    AutoLogin := True;
    Host := 'pop.clubedelphi.com.br';
    Username := 'clubedelphi@clubedelphi.com.br';
    UseTLS := utUseImplicitTLS;
    Password := 'senha';
    Port := 995;
  end;
  //TIdSSLIOHandlerSocketOpenSSL
  with IO_OpenSSL do begin
    Destination := 'pop.clubedelphi.com.br:995';
    Host := 'pop.clubedelphi.com.br';
    Port := 995;
    SSLOptions.Method := sslvSSLv23;
    SSLOptions.Mode := sslmClient;
  end;
  //Conectando
  if not POP3.Connected then
    POP3.Connect;
  //testa a conexão
  if not POP3.Connected then
  Begin
    ShowMessage('Conexão não realizada!');
    Exit;
  End;
  //Pega a qtd de msg que há na caixa de entrada
  iMsgs := POP3.CheckMessages;
  sEmail := TStringList.Create;
  lMsg := TIdMessage.Create;
  lMsg.Encoding := meMIME;
  //Recebe a mensagem
  for i := 1 to iMsgs do
  begin
    POP3.Retrieve(i, lMsg);
    for iMsgs := 1 to lMsg.MessageParts.Count - 1 do
    begin
      if lMsg.MessageParts.Items[iMsgs] is TIdText then
      begin
        sTexto := TIdText(lMsg.MessageParts.Items[iMsgs]).Body.Text;
        sTexto := StringReplace(sTexto,'&lt;','<',[rfReplaceAll, rfIgnoreCase]);
        sTexto := StringReplace(sTexto,'&gt;','>',[rfReplaceAll, rfIgnoreCase]);
        sTexto := StringReplace(sTexto,'<br>','',[rfReplaceAll, rfIgnoreCase]);
      end;
      sEmail.Add(sTexto);
      POP3.Delete(iMsgs);
    end;
  end;
  try
    sEmail.SaveToFile('C:\email.xml');
  finally
    POP3.Disconnect;
    lMsg.Free;
    sEmail.Free;
    ShowMessage('Arquivo gerado.');
  end;
end;}
