package parte_3;

import java.io.*;

public class ArquivoCopia {

    private File arquivoOrigem;
    private File arquivoDestino;
    private boolean existeOrigem;
    private boolean existeDestino;
    private FileReader fr;
    private BufferedReader br;
    private FileWriter fw;
    private BufferedWriter bw;

    public ArquivoCopia(){

        arquivoOrigem = new File("origem.txt");
        arquivoDestino = new File("destino.txt");
        existeOrigem = arquivoOrigem.exists();
        existeDestino = arquivoDestino.exists();

    }

    public void copiaConteudoArquivo() throws IOException {

        if (!existeOrigem){

            arquivoOrigem.createNewFile();
            arquivoOrigem.mkdir();

        }

        if (!existeDestino){

            arquivoDestino.createNewFile();
            arquivoDestino.mkdir();

        }

    }
}
