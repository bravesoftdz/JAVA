object fSendMail: TfSendMail
  Left = 684
  Top = 231
  Width = 432
  Height = 411
  Caption = 'SendMail'
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  Position = poScreenCenter
  OnClose = FormClose
  PixelsPerInch = 96
  TextHeight = 13
  object pcPaginas: TPageControl
    Left = 0
    Top = 0
    Width = 416
    Height = 373
    ActivePage = tsRemetente
    Align = alClient
    Font.Charset = DEFAULT_CHARSET
    Font.Color = clWindowText
    Font.Height = -11
    Font.Name = 'MS Sans Serif'
    Font.Style = [fsBold]
    ParentFont = False
    TabOrder = 0
    object tsRemetente: TTabSheet
      Caption = 'Dados Remetente'
      ImageIndex = 1
      object Bevel2: TBevel
        Left = 0
        Top = 0
        Width = 408
        Height = 345
        Align = alClient
        Shape = bsFrame
        Style = bsRaised
      end
      object Bevel3: TBevel
        Left = 0
        Top = 0
        Width = 408
        Height = 345
        Align = alClient
        Shape = bsFrame
        Style = bsRaised
      end
      object Bevel4: TBevel
        Left = 0
        Top = 0
        Width = 408
        Height = 345
        Align = alClient
        Shape = bsFrame
        Style = bsRaised
      end
      object Label5: TLabel
        Left = 16
        Top = 8
        Width = 102
        Height = 13
        Caption = 'Nome Remetente:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label6: TLabel
        Left = 16
        Top = 51
        Width = 105
        Height = 13
        Caption = 'E-Mail Remetente:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label7: TLabel
        Left = 16
        Top = 165
        Width = 39
        Height = 13
        Caption = 'SMTP:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label8: TLabel
        Left = 16
        Top = 119
        Width = 61
        Height = 13
        Caption = 'Username:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label9: TLabel
        Left = 216
        Top = 119
        Width = 59
        Height = 13
        Caption = 'Password:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label10: TLabel
        Left = 16
        Top = 210
        Width = 73
        Height = 13
        Caption = 'Porta SMTP:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label15: TLabel
        Left = 216
        Top = 210
        Width = 71
        Height = 13
        Caption = 'Porta POP3:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label16: TLabel
        Left = 216
        Top = 164
        Width = 37
        Height = 13
        Caption = 'POP3:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object edNomeRemetente: TEdit
        Left = 16
        Top = 24
        Width = 377
        Height = 21
        TabOrder = 0
      end
      object edEmailRemetente: TEdit
        Left = 16
        Top = 67
        Width = 377
        Height = 21
        TabOrder = 1
      end
      object edSMTP: TEdit
        Left = 16
        Top = 181
        Width = 177
        Height = 21
        TabOrder = 4
        Text = 'smtp.'
      end
      object edUserName: TEdit
        Left = 16
        Top = 135
        Width = 177
        Height = 21
        TabOrder = 2
      end
      object edPassword: TEdit
        Left = 216
        Top = 135
        Width = 177
        Height = 21
        PasswordChar = '*'
        TabOrder = 3
      end
      object cbSSL: TCheckBox
        Left = 217
        Top = 258
        Width = 97
        Height = 17
        Caption = 'SSL Socket'
        TabOrder = 9
      end
      object edPorta: TEdit
        Left = 16
        Top = 226
        Width = 35
        Height = 21
        TabOrder = 6
        Text = '25'
      end
      object cbAutentica: TCheckBox
        Left = 17
        Top = 258
        Width = 105
        Height = 17
        Caption = 'Autenticar'
        TabOrder = 8
      end
      object edPortaPOP3: TEdit
        Left = 216
        Top = 226
        Width = 35
        Height = 21
        TabOrder = 7
        Text = '995'
      end
      object edPOP3: TEdit
        Left = 216
        Top = 180
        Width = 177
        Height = 21
        TabOrder = 5
        Text = 'pop.'
      end
    end
    object tsEmail: TTabSheet
      Caption = 'Enviar E-mail'
      object Bevel1: TBevel
        Left = 0
        Top = 0
        Width = 408
        Height = 345
        Align = alClient
        Shape = bsFrame
        Style = bsRaised
      end
      object Label1: TLabel
        Left = 16
        Top = 8
        Width = 31
        Height = 13
        Caption = 'Para:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label2: TLabel
        Left = 16
        Top = 51
        Width = 50
        Height = 13
        Caption = 'Assunto:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label3: TLabel
        Left = 16
        Top = 96
        Width = 46
        Height = 13
        Caption = 'Anexos:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label4: TLabel
        Left = 16
        Top = 179
        Width = 65
        Height = 13
        Caption = 'Mensagem:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object lbMensagem: TLabel
        Left = 16
        Top = 163
        Width = 13
        Height = 13
        Caption = '...'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clGreen
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object edPara: TEdit
        Left = 16
        Top = 24
        Width = 377
        Height = 21
        TabOrder = 0
      end
      object edAssunto: TEdit
        Left = 16
        Top = 67
        Width = 377
        Height = 21
        TabOrder = 1
        Text = 'Teste Envio E-mail'
      end
      object lbxAnexos: TListBox
        Left = 16
        Top = 112
        Width = 377
        Height = 49
        ItemHeight = 13
        TabOrder = 2
      end
      object mmMensagem: TMemo
        Left = 16
        Top = 194
        Width = 377
        Height = 104
        Lines.Strings = (
          'Teste - E-mail recebido')
        ScrollBars = ssVertical
        TabOrder = 4
      end
      object btnAnexar: TButton
        Left = 317
        Top = 162
        Width = 75
        Height = 17
        Caption = 'Anexar'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
        TabOrder = 3
        OnClick = btnAnexarClick
      end
      object btnEnviar: TButton
        Left = 16
        Top = 298
        Width = 75
        Height = 25
        Caption = 'Enviar'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
        TabOrder = 5
        OnClick = btnEnviarClick
      end
      object btnFechar: TButton
        Left = 318
        Top = 298
        Width = 75
        Height = 25
        Caption = 'Fechar'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
        TabOrder = 7
        OnClick = btnFecharClick
      end
      object btnLimpar: TButton
        Left = 232
        Top = 298
        Width = 75
        Height = 25
        Caption = 'Limpar'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
        TabOrder = 6
        OnClick = btnLimparClick
      end
    end
    object tsEntrada: TTabSheet
      Caption = 'Receber E-mail'
      ImageIndex = 2
      object Bevel5: TBevel
        Left = 0
        Top = 0
        Width = 408
        Height = 345
        Align = alClient
        Shape = bsFrame
        Style = bsRaised
      end
      object lbMensagemPOP: TLabel
        Left = 17
        Top = 90
        Width = 13
        Height = 13
        Caption = '...'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clGreen
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label11: TLabel
        Left = 16
        Top = 8
        Width = 21
        Height = 13
        Caption = 'De:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label12: TLabel
        Left = 16
        Top = 51
        Width = 50
        Height = 13
        Caption = 'Assunto:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label13: TLabel
        Left = 16
        Top = 106
        Width = 65
        Height = 13
        Caption = 'Mensagem:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clWindowText
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object Label14: TLabel
        Left = 16
        Top = 326
        Width = 134
        Height = 13
        Caption = 'N'#250'mero de Mensagens:'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clGreen
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object lbTotalMensagensRecebidas: TLabel
        Left = 154
        Top = 326
        Width = 13
        Height = 13
        Caption = '...'
        Font.Charset = DEFAULT_CHARSET
        Font.Color = clGreen
        Font.Height = -11
        Font.Name = 'MS Sans Serif'
        Font.Style = [fsBold]
        ParentFont = False
      end
      object btnReceber: TButton
        Left = 178
        Top = 296
        Width = 68
        Height = 25
        Caption = 'Receber'
        TabOrder = 3
        OnClick = btnReceberClick
      end
      object edFrom: TEdit
        Left = 16
        Top = 24
        Width = 377
        Height = 21
        TabOrder = 0
      end
      object edSubject: TEdit
        Left = 16
        Top = 67
        Width = 377
        Height = 21
        TabOrder = 1
      end
      object mmMensagemRecebida: TMemo
        Left = 16
        Top = 122
        Width = 377
        Height = 172
        ScrollBars = ssVertical
        TabOrder = 2
      end
      object btnProximo: TButton
        Left = 322
        Top = 296
        Width = 70
        Height = 25
        Caption = 'Pr'#243'ximo >>'
        TabOrder = 4
        OnClick = btnProximoClick
      end
      object btnAnterior: TButton
        Left = 249
        Top = 296
        Width = 70
        Height = 25
        Caption = '<< Anterior'
        TabOrder = 5
        OnClick = btnAnteriorClick
      end
      object btnDesconectaPOP3: TButton
        Left = 16
        Top = 296
        Width = 89
        Height = 25
        Caption = 'Desconectar'
        TabOrder = 6
        OnClick = btnDesconectaPOP3Click
      end
    end
  end
  object odAnexos: TOpenDialog
    Left = 316
    Top = 6
  end
  object IdMessage: TIdMessage
    AttachmentEncoding = 'MIME'
    BccList = <>
    CCList = <>
    DeleteTempFiles = False
    Encoding = meMIME
    Recipients = <>
    ReplyTo = <>
    Left = 288
    Top = 6
  end
  object IdSMTP: TIdSMTP
    MaxLineAction = maException
    Port = 25
    AuthenticationType = atNone
    Left = 262
    Top = 6
  end
  object SSLSocket: TIdSSLIOHandlerSocket
    SSLOptions.Method = sslvSSLv2
    SSLOptions.Mode = sslmUnassigned
    SSLOptions.VerifyMode = []
    SSLOptions.VerifyDepth = 0
    Left = 236
    Top = 6
  end
  object IdPOP31: TIdPOP3
    MaxLineAction = maException
    Left = 344
    Top = 6
  end
  object IdMessagePOP3: TIdMessage
    AttachmentEncoding = 'MIME'
    BccList = <>
    CCList = <>
    DeleteTempFiles = False
    Encoding = meMIME
    Recipients = <>
    ReplyTo = <>
    Left = 373
    Top = 6
  end
end
