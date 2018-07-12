package teste;

import java.lang.reflect.Method;
import java.util.Iterator;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author Diego Munhoz
 */
public class ListDataSource<T> implements JRDataSource {

    private final Pattern patternSplit = Pattern.compile("\\.");
    private T atual;
    private final Iterator<T> iterator;

    public ListDataSource(List<T> objetos) {
        iterator = objetos.iterator();
    }

    @Override
    public boolean next() throws JRException {
        boolean hasNext = iterator.hasNext();
        if(hasNext) {
            atual = iterator.next();
        }
        return hasNext;
    }

    private final String padraoJavaGetter(String nome) {
        char[] nomeChar = nome.toCharArray();
        char[] nomeRetorno = new char[nome.length() + 3];
        nomeRetorno[0] = 'g';
        nomeRetorno[1] = 'e';
        nomeRetorno[2] = 't';
        nomeRetorno[3] = Character.toUpperCase(nomeChar[0]);
        System.arraycopy(nomeChar, 1, nomeRetorno, 4, nomeChar.length - 1);
        String retorno = new String(nomeRetorno);
        return retorno;
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        try {
            T objetoAtual = atual;

            Object alvo = objetoAtual;

            String[] separado = patternSplit.split(jrf.getName());

            for (int i = 1; i < separado.length; i++) {
                String seccaoAtual = separado[i];
                String nomeMetodo = padraoJavaGetter(seccaoAtual);
                Method getter = alvo.getClass().getMethod(nomeMetodo);

                alvo = getter.invoke(alvo);

            }

            return alvo;

        } catch (Exception e) {
            throw new RuntimeException("Erro ao gerar relatório", e);
        }
    }
}
