import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            Questao q1 = new Questao();
            q1.pergunta = "Em qual filme da Disney vemos pela primeira vez o personagem Simba?";
            q1.opcaoA = "A) A Bela e a Fera";
            q1.opcaoB = "B) O Rei Leão";
            q1.opcaoC = "C) Aladdin";
            q1.opcaoD = "D) Pocahontas";
            q1.opcaoE = "E) Mulan";
            q1.correta = "B";

            q1.escrevaQuestao();
            String resposta = q1.leiaResposta();
            q1.isCorreta(resposta);

            //proxima questao

            Questao q2 = new Questao();
            q2.pergunta = "Qual é o nome do brinquedo cowboy no filme Toy Story?";
            q2.opcaoA = "A) Buzz Lightyear";
            q2.opcaoB = "B) Slinky";
            q2.opcaoC = "C) Woody";
            q2.opcaoD = "D) Rex";
            q2.opcaoE = "E) Mr. Potato Head";
            q2.correta = "C";

            q2.escrevaQuestao();
            String resposta2 = q2.leiaResposta();
            q2.isCorreta(resposta2);

            //proxima questao

            Questao q3 = new Questao();
            q3.pergunta = "Qual é o nome do vilão em A Pequena Sereia?";
            q3.opcaoA = "A) Jafar";
            q3.opcaoB = "B) Scar";
            q3.opcaoC = "C) Malévola";
            q3.opcaoD = "D) Úrsula";
            q3.opcaoE = "E) Hades";
            q3.correta = "D";

            q3.escrevaQuestao();
            String resposta3 = q3.leiaResposta();
            q3.isCorreta(resposta3);

            //proxima questao

            Questao q4 = new Questao();
            q4.pergunta = "Qual é o animal de estimação da princesa Jasmine em Aladdin?";
            q4.opcaoA = "A) Um macaco";
            q4.opcaoB = "B) Um papagaio";
            q4.opcaoC = "C) Um leão";
            q4.opcaoD = "D) Um tigre";
            q4.opcaoE = "E) Um cavalo";
            q4.correta = "D";

            q4.escrevaQuestao();
            String resposta4 = q4.leiaResposta();
            q4.isCorreta(resposta4);

            //proxima questao

            Questao q5 = new Questao();
            q5.pergunta = "Em Frozen, qual é o nome da irmã de Elsa?";
            q5.opcaoA = "A) Anna";
            q5.opcaoB = "B) Ariel";
            q5.opcaoC = "C) Rapunzel";
            q5.opcaoD = "D) Bela";
            q5.opcaoE = "E) Tiana";
            q5.correta = "A";

            q5.escrevaQuestao();
            String resposta5 = q5.leiaResposta();
            q5.isCorreta(resposta5);

            //proxima questao

            Questao q6 = new Questao();
            q6.pergunta = "Em \"Procurando Nemo\", qual é o nome da peixe que tem perda de memória recente?";
            q6.opcaoA = "A) Dory";
            q6.opcaoB = "B) Marlin";
            q6.opcaoC = "C) Crush";
            q6.opcaoD = "D) Bruce";
            q6.opcaoE = "E) Squirt";
            q6.correta = "A";

            q6.escrevaQuestao();
            String resposta6 = q6.leiaResposta();
            q6.isCorreta(resposta6);

            //proxima quetao

            Questao q7 = new Questao();
            q7.pergunta = "Qual é o nome do ratinho chefe em \"Ratatouille\"?";
            q7.opcaoA = "A) Linguini";
            q7.opcaoB = "B) Remy";
            q7.opcaoC = "C) Gusteau";
            q7.opcaoD = "D) Alfredo";
            q7.opcaoE = "E) Emile";
            q7.correta = "B";

            q7.escrevaQuestao();
            String resposta7 = q7.leiaResposta();
            q7.isCorreta(resposta7);

            //PROXIMA QUESTAO

            Questao q8 = new Questao();
            q8.pergunta = "Quem ajuda a Cinderela a ir ao baile?";
            q8.opcaoA = "A) As irmãs más";
            q8.opcaoB = "B) A madrasta";
            q8.opcaoC = "C) O príncipe";
            q8.opcaoD = "D) A Fada Madrinha";
            q8.opcaoE = "E) Os ratos";
            q8.correta = "D";

            q8.escrevaQuestao();
            String resposta8 = q8.leiaResposta();
            q8.isCorreta(resposta8);

            //PROXIMA QUESTAO

            Questao q9 = new Questao();
            q9.pergunta = "Qual é o nome do dragão em \"Mulan\"?";
            q9.opcaoA = "A) Smaug";
            q9.opcaoB = "B) Mushu";
            q9.opcaoC = "C) Elliot";
            q9.opcaoD = "D) Falcor";
            q9.opcaoE = "E) Shenron";
            q9.correta = "B";

            q9.escrevaQuestao();
            String resposta9 = q9.leiaResposta();
            q9.isCorreta(resposta9);

            //PROXIMA QUESTAO

            Questao q10 = new Questao();
            q10.pergunta = "Qual é o nome da princesa no filme A Bela Adormecida?";
            q10.opcaoA = "A) Bela";
            q10.opcaoB = "B) Cinderela";
            q10.opcaoC = "C) Aurora";
            q10.opcaoD = "D) Branca de Neve";
            q10.opcaoE = "E) Jasmine";
            q10.correta = "C";

            q10.escrevaQuestao();
            String resposta10 = q10.leiaResposta();
            q10.isCorreta(resposta10);

            //PROXIMA QUESTAO

            Questao q11 = new Questao();
            q11.pergunta = "Em Aladdin, o que o gênio da lâmpada oferece a Aladdin?";
            q11.opcaoA = "A) Três desejos";
            q11.opcaoB = "B) Um castelo";
            q11.opcaoC = "C) Um novo traje";
            q11.opcaoD = "D) A liberdade";
            q11.opcaoE = "";




        }
    }