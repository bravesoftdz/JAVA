package Forca;

import java.awt.Font;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class principal extends javax.swing.JFrame {

    //criacao de variáveis e definição das imagens e cria os vetores
    String PalavraSorteada = new String();
    ArrayList Tentativas = new ArrayList();
    String Campo_Tentar;
    int MaxTentativas = 6;
    int NumTentativas = 0;
    int conta_palavras_usadas = 0;
    boolean FimDoJogo = true;
    ImageIcon icon0 = new ImageIcon("forca00.jpg");
    ImageIcon icon1 = new ImageIcon("forca11.jpg");
    ImageIcon icon2 = new ImageIcon("forca22.jpg");
    ImageIcon icon3 = new ImageIcon("forca33.jpg");
    ImageIcon icon4 = new ImageIcon("forca44.jpg");
    ImageIcon icon5 = new ImageIcon("forca55.jpg");
    ImageIcon icon6 = new ImageIcon("forca66.jpg");
    //Pontos
    int Melhor, ponto;
    static String palavras_cadastradas[] = new String[1000];
    static String palavras_ja_usadas[] = new String[1000];
    static String dicas_cadastradas[] = new String[1000];
    static String dica;
    static String nova_palavra;
    static String verifica_palavra;
    static String palavra_da_vez;
    static int i, posicao, posicao_palavra, opcao, tamanho_vetor;

    //Método que inicia as funcoes de criação das imagens
    @Override
    public Image createImage(int width, int height) {
        return super.createImage(width, height);
    }

    //Método que Inicia o Formulário
    public principal() {
        initComponents();
        setLocationRelativeTo(null);
        //Desabilita Botoes da Tela
        desabilitabotoes();
    }

    //Método que desabilita os botões da tela até ser iniciado o jogo
    public void desabilitabotoes() {
        botao_A.setEnabled(false);
        botao_B.setEnabled(false);
        botao_C.setEnabled(false);
        botao_D.setEnabled(false);
        botao_E.setEnabled(false);
        botao_F.setEnabled(false);
        botao_G.setEnabled(false);
        botao_H.setEnabled(false);
        botao_I.setEnabled(false);
        botao_J.setEnabled(false);
        botao_K.setEnabled(false);
        botao_L.setEnabled(false);
        botao_M.setEnabled(false);
        botao_N.setEnabled(false);
        botao_O.setEnabled(false);
        botao_P.setEnabled(false);
        botao_Q.setEnabled(false);
        botao_R.setEnabled(false);
        botao_S.setEnabled(false);
        botao_T.setEnabled(false);
        botao_U.setEnabled(false);
        botao_V.setEnabled(false);
        botao_W.setEnabled(false);
        botao_X.setEnabled(false);
        botao_Y.setEnabled(false);
        botao_Z.setEnabled(false);
        Botao_Mudar_Palavra.setEnabled(false);
        Cadastrar.setEnabled(false);
        LbPonto.setEnabled(false);
        LbMelhor.setEnabled(false);
        PalavraForca.setEnabled(false);
    }

    //Método que Habilita os botões da tela quando é ser iniciado o jogo
    public void habilitabotoes() {
        botao_A.setEnabled(true);
        botao_B.setEnabled(true);
        botao_C.setEnabled(true);
        botao_D.setEnabled(true);
        botao_E.setEnabled(true);
        botao_F.setEnabled(true);
        botao_G.setEnabled(true);
        botao_H.setEnabled(true);
        botao_I.setEnabled(true);
        botao_J.setEnabled(true);
        botao_K.setEnabled(true);
        botao_L.setEnabled(true);
        botao_M.setEnabled(true);
        botao_N.setEnabled(true);
        botao_O.setEnabled(true);
        botao_P.setEnabled(true);
        botao_Q.setEnabled(true);
        botao_R.setEnabled(true);
        botao_S.setEnabled(true);
        botao_T.setEnabled(true);
        botao_U.setEnabled(true);
        botao_V.setEnabled(true);
        botao_W.setEnabled(true);
        botao_X.setEnabled(true);
        botao_Y.setEnabled(true);
        botao_Z.setEnabled(true);
        btnao.setEnabled(true);
        btsim.setEnabled(true);
        deseja_sair.setEnabled(true);
        Botao_Mudar_Palavra.setEnabled(true);
        Cadastrar.setEnabled(true);
        LbPonto.setEnabled(true);
        LbMelhor.setEnabled(true);
        PalavraForca.setEnabled(true);
    }

    //Método que carrega os Vetores do TXT
    public void Carregar_Vetores() {
        habilitabotoes();
        try {
            File Arquivo = new File("Palavras.txt"); //lê o arquivo Txt
            FileReader leitor = new FileReader(Arquivo);
            BufferedReader leitorBuf = new BufferedReader(leitor);
            String linha = null;
            i = 1;
            while ((linha = leitorBuf.readLine()) != null) {
                //lê a linha contendo a palavra e a dica, 
                //sabendo q as mesmas sao separadas pelo #
                String colunas[] = linha.split("#");
                //Carrega as palavras do txt para um array
                palavras_cadastradas[i] = colunas[0];
                //Carrega as dicas das palavras do txt para um array
                dicas_cadastradas[i] = colunas[1];
                i++;
                tamanho_vetor++;
            }
            //Fecha o Leitor de texto
            leitorBuf.close();
        } catch (IOException ex) {
            System.out.println("Erro: " + ex.toString());
        }
    }

    //Método que verifica palavras Usadas
    public void Verifica_Posicao_Vetor() {
        Mudar_Palavra();
        Mudar_Palavra();
    }

    //Método que muda as palavras
    public void Mudar_Palavra() {
        fim_do_Jogo();
        habilitabotoes();
        for (i = 1; i <= tamanho_vetor; i++) {
            if ((palavras_cadastradas[i]) != (palavras_ja_usadas[i])) {
                PalavraSorteada = palavras_cadastradas[i];
                dica = dicas_cadastradas[i];
                palavras_ja_usadas[i] = palavras_cadastradas[i];
                PalavraSorteada = PalavraSorteada.toUpperCase();
                conta_palavras_usadas++;
                desenharpalavra(false);
                break;
            }
        }
        TxtDica.setFont (new Font ("Comic Sans", Font.BOLD,35));
        TxtDica.setText("DICA: " + dica);
    }

    //Método que desenha a palavra e os traços
    public void desenharpalavra(boolean Mostra_APalavra) {
        String tempTexto = new String();
        boolean faltauma = false;
        for (int n = 1; n <= PalavraSorteada.length(); n++) {//pega o tamanho da palavra e cria os tracinhos
            if ((Mostra_APalavra) || (Tentativas.contains(PalavraSorteada.substring(n - 1, n)))) {
                tempTexto = tempTexto + PalavraSorteada.substring(n - 1, n);
            } else {
                tempTexto = tempTexto + "_";
                faltauma = true;
            }
            tempTexto = tempTexto + " ";
        }

        PalavraForca.setText(tempTexto);

        if (!faltauma) {
            FimDoJogo = true;
            if ((NumTentativas) < 6) {//verifica se o numero de tentativas é menor que 6; se for, o usuario ganhou
                joga_nov.pack();//abre a mensagem que pede se o usuário quer jogar novamente
                joga_nov.setLocationRelativeTo(null);
                joga_nov.setVisible(true);
            }
        }
    }

    //Método que verifica se existe a Letra selecionada 
    public void verificarLetra(String Letra) {
        Letra = Letra.toUpperCase();
        if (Tentativas.contains(Letra)) {
            // Mostrar mensagem de que já foi tentada esta letra
        } else {
            // Armazena a letra nova na lista de tentativas.
            Tentativas.add(Letra);
            if (PalavraSorteada.contains(Letra)) {
                // Acertou
                //Pontuacao
                ponto++;
                String aux2;
                aux2 = "" + ponto;
                LbPonto.setText(aux2);

                if (ponto > Melhor) {
                    Melhor = ponto;
                    String aux;
                    aux = " " + Melhor;
                    LbMelhor.setText(aux);
                }
                //Seta o boolean do desenho da palavra pra nao mostrar a palavra.
                desenharpalavra(false);
            } else {
                NumTentativas = NumTentativas + 1;//vai adicionando o numero de tentativas; se errar, adiciona o desenho
                switch (NumTentativas) {
                    case (1): {
                        LabelImagem.setIcon(icon1);
                        break;
                    }
                    case (2): {
                        LabelImagem.setIcon(icon2);
                        break;
                    }
                    case (3): {
                        LabelImagem.setIcon(icon3);
                        break;
                    }
                    case (4): {
                        LabelImagem.setIcon(icon4);
                        break;
                    }
                    case (5): {
                        LabelImagem.setIcon(icon5);
                        break;
                    }
                    case (6): {
                        LabelImagem.setIcon(icon6);
                        FimDoJogo = true;
                        //Mostra a Palavra no fim do jogo
                        desenharpalavra(true);

                        FimDoJogo = true;
                        jogo_novo.pack();
                        jogo_novo.setLocationRelativeTo(null);
                        jogo_novo.setVisible(true);
                        //Zera os Pontos do Label Ponto
                        LbPonto.setText("");
                        ponto = 0;
                        //Zera as tentativas para novo jogo
                        NumTentativas = 0;
                        break;
                    }
                }
            }
        }
    }

    //Método que reinicia o jogo após acabar as palavras do Vetor
    public void reiniciar_jogo() {
        //Reseta o Jogo
        TxtDica.enable(true);
        PalavraForca.enable(true);
        PalavraForca.setText("");//limpa os campos
        Tentativas.clear();//limpa as tentativas
        //Limpa os Vetores
        for (i = 1; i <= tamanho_vetor; i++) {
            palavras_cadastradas[i] = "";
            palavras_ja_usadas[i] = "";
            PalavraSorteada = "";
            palavras_cadastradas[i] = "";
            dicas_cadastradas[i] = "";
            conta_palavras_usadas = 0;
            tamanho_vetor = 0;
            dica = "";
        }
        //Carrega as palavras do TXT para Os Vetores
        Carregar_Vetores();
        //Mudar_Palavra();//Carrega os tracos com a Dica
        Verifica_Posicao_Vetor();//Verifica as posicoes do Vetor
        FimDoJogo = false; //Como ainda não é o fim do jogo, a opção se torna falsa
        LabelImagem.setIcon(icon0); //seta o ícone normal, do desenho da forca
        NumTentativas = 0; // zera o numero de tentativas
        desenharpalavra(false);
    }
    //Método que chama o Método  reiniciar_jogo()
    public void fim_do_Jogo() {
        //Aqui faz a verificação de quando é o fim do jogo
        //Ou seja , Verifica se todas as palavras ja foram usadas
        //E pergunta ao usuario se deseja jogar tudo de novo

        if (conta_palavras_usadas == tamanho_vetor) {
            int resposta = JOptionPane.showConfirmDialog(null, "Deseja jogar tudo de novo?");
            if (resposta == JOptionPane.YES_OPTION) {
                reiniciar_jogo();
            } else {
                System.exit(0);
            }
        }

    }

    //Abaixo códigos gerados pelo Java automático   
    //Observe:Usado Funcao do Java para ficar Default Suprimido os Codigos 
    //que nao tem ligacao direta com os eventos principais
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        joga_nov = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jogo_novo = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        deseja_sair = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        btsim = new javax.swing.JButton();
        btnao = new javax.swing.JButton();
        PalavraForca = new javax.swing.JTextField();
        LabelImagem = new javax.swing.JLabel();
        TxtDica = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        botao_Z = new javax.swing.JButton();
        botao_Y = new javax.swing.JButton();
        botao_A = new javax.swing.JButton();
        botao_V = new javax.swing.JButton();
        botao_W = new javax.swing.JButton();
        botao_M = new javax.swing.JButton();
        botao_L = new javax.swing.JButton();
        botao_C = new javax.swing.JButton();
        botao_B = new javax.swing.JButton();
        botao_O = new javax.swing.JButton();
        botao_D = new javax.swing.JButton();
        botao_K = new javax.swing.JButton();
        botao_T = new javax.swing.JButton();
        botao_I = new javax.swing.JButton();
        botao_R = new javax.swing.JButton();
        botao_U = new javax.swing.JButton();
        botao_J = new javax.swing.JButton();
        botao_N = new javax.swing.JButton();
        botao_G = new javax.swing.JButton();
        botao_P = new javax.swing.JButton();
        botao_E = new javax.swing.JButton();
        botao_F = new javax.swing.JButton();
        botao_S = new javax.swing.JButton();
        botao_X = new javax.swing.JButton();
        botao_Q = new javax.swing.JButton();
        botao_H = new javax.swing.JButton();
        Novo_Jogo = new javax.swing.JButton();
        Botao_Sair = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LbMelhor = new javax.swing.JTextField();
        LbPonto = new javax.swing.JTextField();
        Cadastrar = new javax.swing.JButton();
        Botao_Mudar_Palavra = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setText("Você ganhou. Quer jogar novamente?");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forca/salvar.jpg"))); // NOI18N
        jButton1.setText("Sim");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forca/cancelar.jpg"))); // NOI18N
        jButton2.setText("Não");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout joga_novLayout = new javax.swing.GroupLayout(joga_nov.getContentPane());
        joga_nov.getContentPane().setLayout(joga_novLayout);
        joga_novLayout.setHorizontalGroup(
            joga_novLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joga_novLayout.createSequentialGroup()
                .addGroup(joga_novLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, joga_novLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, joga_novLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        joga_novLayout.setVerticalGroup(
            joga_novLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(joga_novLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(joga_novLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Você perdeu. Jogar novamente?");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forca/salvar.jpg"))); // NOI18N
        jButton3.setText("Sim");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forca/cancelar.jpg"))); // NOI18N
        jButton4.setText("Não");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jogo_novoLayout = new javax.swing.GroupLayout(jogo_novo.getContentPane());
        jogo_novo.getContentPane().setLayout(jogo_novoLayout);
        jogo_novoLayout.setHorizontalGroup(
            jogo_novoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jogo_novoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jogo_novoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jogo_novoLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(61, 61, 61)
                        .addComponent(jButton4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jogo_novoLayout.setVerticalGroup(
            jogo_novoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jogo_novoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jogo_novoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        deseja_sair.setBounds(new java.awt.Rectangle(50, 50, 240, 200));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Deseja mesmo sair?");

        btsim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forca/salvar.jpg"))); // NOI18N
        btsim.setText("Sim");
        btsim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimActionPerformed(evt);
            }
        });

        btnao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forca/cancelar.jpg"))); // NOI18N
        btnao.setText("Não");
        btnao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deseja_sairLayout = new javax.swing.GroupLayout(deseja_sair.getContentPane());
        deseja_sair.getContentPane().setLayout(deseja_sairLayout);
        deseja_sairLayout.setHorizontalGroup(
            deseja_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deseja_sairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btsim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnao)
                .addGap(20, 20, 20))
            .addGroup(deseja_sairLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        deseja_sairLayout.setVerticalGroup(
            deseja_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deseja_sairLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addGroup(deseja_sairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btsim)
                    .addComponent(btnao))
                .addGap(29, 29, 29))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Forca - Enforcado");

        PalavraForca.setEditable(false);
        PalavraForca.setFont(new java.awt.Font("Arial Black", 0, 36)); // NOI18N
        PalavraForca.setEnabled(false);

        LabelImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/forca/forca00.jpg"))); // NOI18N

        TxtDica.setEditable(false);
        TxtDica.setFont(new java.awt.Font("Verdana", 0, 10)); // NOI18N
        TxtDica.setEnabled(false);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FORCA/jogodaforca.gif"))); // NOI18N

        botao_Z.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/Z.GIF"))); // NOI18N
        botao_Z.setAlignmentX(0.5F);
        botao_Z.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_ZMouseClicked(evt);
            }
        });

        botao_Y.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/Y.GIF"))); // NOI18N
        botao_Y.setAlignmentX(0.5F);
        botao_Y.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_YMouseClicked(evt);
            }
        });

        botao_A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/A.GIF"))); // NOI18N
        botao_A.setAlignmentX(0.5F);
        botao_A.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_AMouseClicked(evt);
            }
        });

        botao_V.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/V.GIF"))); // NOI18N
        botao_V.setAlignmentX(0.5F);
        botao_V.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_VMouseClicked(evt);
            }
        });

        botao_W.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/W.GIF"))); // NOI18N
        botao_W.setAlignmentX(0.5F);
        botao_W.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_WMouseClicked(evt);
            }
        });

        botao_M.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/M.GIF"))); // NOI18N
        botao_M.setAlignmentX(0.5F);
        botao_M.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_MMouseClicked(evt);
            }
        });

        botao_L.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/L.GIF"))); // NOI18N
        botao_L.setAlignmentX(0.5F);
        botao_L.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_LMouseClicked(evt);
            }
        });

        botao_C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/C.GIF"))); // NOI18N
        botao_C.setAlignmentX(0.5F);
        botao_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_CMouseClicked(evt);
            }
        });

        botao_B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/B.GIF"))); // NOI18N
        botao_B.setAlignmentX(0.5F);
        botao_B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_BMouseClicked(evt);
            }
        });

        botao_O.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/O.GIF"))); // NOI18N
        botao_O.setAlignmentX(0.5F);
        botao_O.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_OMouseClicked(evt);
            }
        });

        botao_D.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/D.GIF"))); // NOI18N
        botao_D.setAlignmentX(0.5F);
        botao_D.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_DMouseClicked(evt);
            }
        });

        botao_K.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/K.GIF"))); // NOI18N
        botao_K.setAlignmentX(0.5F);
        botao_K.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_KMouseClicked(evt);
            }
        });

        botao_T.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/T.GIF"))); // NOI18N
        botao_T.setAlignmentX(0.5F);
        botao_T.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_TMouseClicked(evt);
            }
        });

        botao_I.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/I.GIF"))); // NOI18N
        botao_I.setAlignmentX(0.5F);
        botao_I.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_IMouseClicked(evt);
            }
        });

        botao_R.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/R.GIF"))); // NOI18N
        botao_R.setAlignmentX(0.5F);
        botao_R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_RMouseClicked(evt);
            }
        });

        botao_U.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/U.GIF"))); // NOI18N
        botao_U.setAlignmentX(0.5F);
        botao_U.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_UMouseClicked(evt);
            }
        });

        botao_J.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/J.GIF"))); // NOI18N
        botao_J.setAlignmentX(0.5F);
        botao_J.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_JMouseClicked(evt);
            }
        });

        botao_N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/N.GIF"))); // NOI18N
        botao_N.setAlignmentX(0.5F);
        botao_N.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_NMouseClicked(evt);
            }
        });

        botao_G.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/G.GIF"))); // NOI18N
        botao_G.setAlignmentX(0.5F);
        botao_G.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_GMouseClicked(evt);
            }
        });

        botao_P.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/P.GIF"))); // NOI18N
        botao_P.setAlignmentX(0.5F);
        botao_P.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_PMouseClicked(evt);
            }
        });

        botao_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/E.GIF"))); // NOI18N
        botao_E.setAlignmentX(0.5F);
        botao_E.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_EMouseClicked(evt);
            }
        });

        botao_F.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/F.GIF"))); // NOI18N
        botao_F.setAlignmentX(0.5F);
        botao_F.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_FMouseClicked(evt);
            }
        });

        botao_S.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/S.GIF"))); // NOI18N
        botao_S.setAlignmentX(0.5F);
        botao_S.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_SMouseClicked(evt);
            }
        });

        botao_X.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/X.GIF"))); // NOI18N
        botao_X.setAlignmentX(0.5F);
        botao_X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_XMouseClicked(evt);
            }
        });

        botao_Q.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/Q.GIF"))); // NOI18N
        botao_Q.setAlignmentX(0.5F);
        botao_Q.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_QMouseClicked(evt);
            }
        });

        botao_H.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/Alfabeto/H.GIF"))); // NOI18N
        botao_H.setAlignmentX(0.5F);
        botao_H.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_HMouseClicked(evt);
            }
        });

        Novo_Jogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FORCA/NOVO.JPG"))); // NOI18N
        Novo_Jogo.setText("Novo_Jogo");
        Novo_Jogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Novo_JogoMouseClicked(evt);
            }
        });
        Novo_Jogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Novo_JogoActionPerformed(evt);
            }
        });

        Botao_Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FORCA/SAIR.JPG"))); // NOI18N
        Botao_Sair.setText("Sair");
        Botao_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_SairActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("Pontos");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("The Best");

        LbMelhor.setEditable(false);
        LbMelhor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LbMelhor.setText("0.00");

        LbPonto.setEditable(false);
        LbPonto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        LbPonto.setText("0.00");

        Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forca/NOVO_TXT.JPG"))); // NOI18N
        Cadastrar.setText("Cadastrar Palavras");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarActionPerformed(evt);
            }
        });

        Botao_Mudar_Palavra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forca/NOVO.JPG"))); // NOI18N
        Botao_Mudar_Palavra.setText("Mudar Palavra");
        Botao_Mudar_Palavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao_Mudar_PalavraActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(LabelImagem)
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                                    .addComponent(LbPonto)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LbMelhor))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Botao_Mudar_Palavra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Novo_Jogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Botao_Sair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(TxtDica, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(PalavraForca, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botao_A, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(botao_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(botao_C, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(botao_D, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(botao_E, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(botao_F, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(botao_G, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(botao_H, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(botao_I, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(botao_J, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(botao_K, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(botao_L, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(13, 13, 13)
                                        .addComponent(botao_M, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botao_N, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(botao_O, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(botao_P, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)
                                        .addComponent(botao_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(botao_R, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(7, 7, 7)
                                        .addComponent(botao_S, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(botao_T, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(botao_U, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(botao_V, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(botao_W, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(botao_X, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(botao_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(botao_Z, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LbPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LbMelhor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Novo_Jogo, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGap(9, 9, 9)
                        .addComponent(Botao_Mudar_Palavra, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGap(11, 11, 11)
                        .addComponent(Botao_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtDica, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PalavraForca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao_A, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_B, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_C, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_D, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_E, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_F, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_G, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_H, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_I, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_J, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_K, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_L, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_M, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao_N, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_O, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_P, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_Q, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_R, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_S, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_T, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_U, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_V, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_W, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_X, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_Y, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_Z, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Abaixo Codigos dos Botoes
    // // <editor-fold defaultstate="collapsed" desc="Generated Code"> 

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Dá um reset no jogo:
        PalavraForca.setText("");
        Tentativas.clear();
        //sortearpalavra();
        Mudar_Palavra();
        FimDoJogo = false;
        LabelImagem.setIcon(icon0);
        NumTentativas = 0;
        desenharpalavra(false);
        joga_nov.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Dá um reset no jogo:
        habilitabotoes();
        PalavraForca.setText("");
        Tentativas.clear();
        //sortearpalavra();
        Mudar_Palavra();
        FimDoJogo = false;
        LabelImagem.setIcon(icon0);
        NumTentativas = 0;
        desenharpalavra(false);
        jogo_novo.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btsimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btsimActionPerformed

    private void btnaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaoActionPerformed
        deseja_sair.setVisible(false);
    }//GEN-LAST:event_btnaoActionPerformed

    private void botao_AMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_AMouseClicked
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("A");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_A.setEnabled(false);
    }//GEN-LAST:event_botao_AMouseClicked

    private void botao_GMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_GMouseClicked
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("G");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_G.setEnabled(false);
    }//GEN-LAST:event_botao_GMouseClicked

    private void Novo_JogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Novo_JogoActionPerformed
        reiniciar_jogo();
    }//GEN-LAST:event_Novo_JogoActionPerformed

    private void Botao_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_SairActionPerformed
        // TODO add your handling code here:
        deseja_sair.setLocationRelativeTo(null);
        deseja_sair.setVisible(true);
        conta_palavras_usadas = 0;
    }//GEN-LAST:event_Botao_SairActionPerformed

    private void botao_BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_BMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("B");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_B.setEnabled(false);
    }//GEN-LAST:event_botao_BMouseClicked

    private void botao_CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_CMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("C");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_C.setEnabled(false);
    }//GEN-LAST:event_botao_CMouseClicked

    private void botao_DMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_DMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("D");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_D.setEnabled(false);
    }//GEN-LAST:event_botao_DMouseClicked

    private void botao_EMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_EMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("E");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_E.setEnabled(false);
    }//GEN-LAST:event_botao_EMouseClicked

    private void botao_FMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_FMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("F");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_F.setEnabled(false);
    }//GEN-LAST:event_botao_FMouseClicked

    private void botao_HMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_HMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("H");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_H.setEnabled(false);
    }//GEN-LAST:event_botao_HMouseClicked

    private void botao_IMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_IMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("I");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_I.setEnabled(false);
    }//GEN-LAST:event_botao_IMouseClicked

    private void botao_JMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_JMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("J");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_J.setEnabled(false);
    }//GEN-LAST:event_botao_JMouseClicked

    private void botao_KMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_KMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("K");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_K.setEnabled(false);
    }//GEN-LAST:event_botao_KMouseClicked

    private void botao_NMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_NMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("N");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_N.setEnabled(false);
    }//GEN-LAST:event_botao_NMouseClicked

    private void botao_OMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_OMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("O");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_O.setEnabled(false);
    }//GEN-LAST:event_botao_OMouseClicked

    private void botao_PMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_PMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("P");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_P.setEnabled(false);
    }//GEN-LAST:event_botao_PMouseClicked

    private void botao_QMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_QMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("Q");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_Q.setEnabled(false);
    }//GEN-LAST:event_botao_QMouseClicked

    private void botao_RMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_RMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("R");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_R.setEnabled(false);
    }//GEN-LAST:event_botao_RMouseClicked

    private void botao_SMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_SMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("S");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_S.setEnabled(false);
    }//GEN-LAST:event_botao_SMouseClicked

    private void botao_TMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_TMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("T");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_T.setEnabled(false);
    }//GEN-LAST:event_botao_TMouseClicked

    private void botao_UMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_UMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("U");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_U.setEnabled(false);
    }//GEN-LAST:event_botao_UMouseClicked

    private void botao_VMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_VMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("V");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_V.setEnabled(false);
    }//GEN-LAST:event_botao_VMouseClicked

    private void botao_WMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_WMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("W");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_W.setEnabled(false);
    }//GEN-LAST:event_botao_WMouseClicked

    private void botao_XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_XMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("X");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_X.setEnabled(false);
    }//GEN-LAST:event_botao_XMouseClicked

    private void botao_YMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_YMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("Y");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_Y.setEnabled(false);
    }//GEN-LAST:event_botao_YMouseClicked

    private void botao_ZMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_ZMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("Z");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_Z.setEnabled(false);
    }//GEN-LAST:event_botao_ZMouseClicked

    private void botao_MMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_MMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("M");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_M.setEnabled(false);
    }//GEN-LAST:event_botao_MMouseClicked

    private void botao_LMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_LMouseClicked
        // TODO add your handling code here:
        if (!FimDoJogo) {//verifica se não é o fim do jogo
            verificarLetra("L");//se não for, pega a letra escrita e verifica se tem na palavra
        }
        //Desabilita o botão
        botao_L.setEnabled(false);
    }//GEN-LAST:event_botao_LMouseClicked

    private void CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarActionPerformed
        // TODO add your handling code here:
        Cadastro formulario = new Cadastro();
        formulario.setVisible(true);
    }//GEN-LAST:event_CadastrarActionPerformed

    private void Botao_Mudar_PalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao_Mudar_PalavraActionPerformed
        Mudar_Palavra();
    }//GEN-LAST:event_Botao_Mudar_PalavraActionPerformed

    private void Novo_JogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Novo_JogoMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_Novo_JogoMouseClicked
    // // </editor-fold>
    
    //Abaixo Metodo Principal
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao_Mudar_Palavra;
    private javax.swing.JButton Botao_Sair;
    private javax.swing.JButton Cadastrar;
    private javax.swing.JLabel LabelImagem;
    private javax.swing.JTextField LbMelhor;
    private javax.swing.JTextField LbPonto;
    private javax.swing.JButton Novo_Jogo;
    private javax.swing.JTextField PalavraForca;
    private javax.swing.JTextField TxtDica;
    private javax.swing.JButton botao_A;
    private javax.swing.JButton botao_B;
    private javax.swing.JButton botao_C;
    private javax.swing.JButton botao_D;
    private javax.swing.JButton botao_E;
    private javax.swing.JButton botao_F;
    private javax.swing.JButton botao_G;
    private javax.swing.JButton botao_H;
    private javax.swing.JButton botao_I;
    private javax.swing.JButton botao_J;
    private javax.swing.JButton botao_K;
    private javax.swing.JButton botao_L;
    private javax.swing.JButton botao_M;
    private javax.swing.JButton botao_N;
    private javax.swing.JButton botao_O;
    private javax.swing.JButton botao_P;
    private javax.swing.JButton botao_Q;
    private javax.swing.JButton botao_R;
    private javax.swing.JButton botao_S;
    private javax.swing.JButton botao_T;
    private javax.swing.JButton botao_U;
    private javax.swing.JButton botao_V;
    private javax.swing.JButton botao_W;
    private javax.swing.JButton botao_X;
    private javax.swing.JButton botao_Y;
    private javax.swing.JButton botao_Z;
    private javax.swing.JButton btnao;
    private javax.swing.JButton btsim;
    private javax.swing.JDialog deseja_sair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDialog joga_nov;
    private javax.swing.JDialog jogo_novo;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
