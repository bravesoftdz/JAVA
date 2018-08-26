unit mensagem;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls;

type
  TfMensagem = class(TForm)
    lbMensagem: TLabel;
    procedure FormClose(Sender: TObject; var Action: TCloseAction);
  private
    { Private declarations }
  public
    { Public declarations }
  end;

var
  fMensagem: TfMensagem;

implementation

{$R *.dfm}

procedure TfMensagem.FormClose(Sender: TObject; var Action: TCloseAction);
begin
  Action := CaFree;
  fMensagem := Nil;
end;

end.
