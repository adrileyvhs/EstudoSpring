package com.dev.estudodev.arquivos;

import org.apache.commons.io.FileUtils;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerCaracter {
    public static  void ImprimirConsole() throws IOException {
        System.out.println("Digite 3 Palavras");
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String linha = bfr.readLine();
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
          do{
            bfw.write(linha);
            bfw.newLine();
            linha= bfr.readLine();
          }while (!(linha.isEmpty()));
          bfr.close();
          bfw.flush();
          bfw.close();
    }

    public static void EscreverCarater() throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("DIGITE OS DADOS");
        pw.flush();
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        File f = new File("a2.txt");
        BufferedWriter bfw = new BufferedWriter(new FileWriter(f.getName()));
        do {
            bfw.write(line);
            bfw.newLine();
            line= scan.nextLine();
        }while (!line.equalsIgnoreCase("fim"));
        pw.printf("Arquivo \"%s\" foicrioado com sucesso!",f.getName());
        bfw.flush();
        bfw.close();
    }

    public static void EscreverCaraterForm() throws IOException {
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("DIGITE OS DADOS");
        pw.flush();
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        File f = new File("a2.txt");
        BufferedWriter bfw = new BufferedWriter(new FileWriter(f.getName()));
        for (int i = 1; i <= 11; i++) {
            for (int j = i; j <= 10; j++) {
                bfw.write(i + "x" +i+ " = " + i*j );
                bfw.newLine();
                ///     line= scan.nextLine();
            }
       ///     line= scan.nextLine();.
      }
    }
    public static  void CopiarArquivo(String Arquivo,String NovoNome) throws IOException {
        File f = new File(Arquivo);
        String NomeArquivo = f.getName();
        BufferedReader br = new BufferedReader(new FileReader(NomeArquivo));
        String line = br.readLine();
        //String NomeArquivoCopy =;
        File fcopy = new File(NomeArquivo.substring(0,NomeArquivo.indexOf(".")).concat(NovoNome));
        BufferedWriter bw = new BufferedWriter (new FileWriter(fcopy.getName()));
         do {
             bw.write(line);
             bw.newLine();
             bw.flush();
             line = br.readLine();
         }while (!(line==null));
        System.out.println("Arquivo Copiado com Sucesso!!");
    }
    public static void comparaArquivos( String arquivo1Path,String arquivo2Path,String diffFilePath){
        //Caminhos dos arquivos de entrada e saída
        try {
            //Lê o conteúdo dos arquivos de entrada
            List<String> linhasArquivo1 = FileUtils.readLines(new File(arquivo1Path), "UTF-8");
            List<String> linhasArquivo2 = FileUtils.readLines(new File(arquivo2Path), "UTF-8");
            //Compara os arquivos e grava as diferenças no arquivo de saída
            //Grava todas as linhas do arquivo1 no arquivo de diferenças
            List<String> diferenca = new ArrayList<>();
            for (int i = 0; i < linhasArquivo1.size(); i++) {
                String linhaArquivo1 = linhasArquivo1.get(i);
                if (!linhasArquivo2.contains(linhaArquivo1)) {
                    // Adiciona a linha e seu número no arquivo de diferenças
                    diferenca.add("Linha " + (i + 1) + ": " + linhaArquivo1);
                }
            }
            FileUtils.writeLines(new File(diffFilePath), "UTF-8", diferenca);
            System.out.println("Diferenças Gravadas em: " + diffFilePath);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void Mostar(int valor){
        for (int i = 0; i < valor; i++) {
            valor=+valor;
        }
      JOptionPane.showConfirmDialog(null,valor);
    }
}