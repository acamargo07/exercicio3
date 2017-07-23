package br.com.exercicio3.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import br.com.exercicio3.streamInterface.StreamInterface;

/**
 * ss
 * @author andre
 *
 */
public class Stream implements StreamInterface {
	
	private static final String VOGAIS = "^A|E|I|O|U$"; 
	
	private String input;
	private int indexVogal;
	private int index;
	
	/**
	 * 
	 * @param param
	 */
	public Stream(String param){
		this.index = 0;
		this.input = param;
	}
	
	/**
	 * Intera para verificar vogal unica
	 * @param chars
	 * @return retorna vogal unica
	 */
	private Predicate<? super String> vogalUnica(List<String> chars) {
		return s -> s.matches(VOGAIS) && chars.stream().filter(v -> v.equals(s)).count() == 1;
	}
	
	@Override
	public char getNext() {
		return this.input.charAt(this.index++);
	}
	
	@Override
	public boolean hasNext() {
		return this.index <= this.input.length() && indexVogal == -1 || index <= indexVogal;
	}

	public void processar() throws RuntimeException {
		List<String> chars = Arrays.asList(this.input.split("")).stream()
				.map(String::toUpperCase).collect(Collectors.toList());
		String consoante = chars.stream().filter(s -> !s.matches(VOGAIS))
				.findFirst().orElseThrow(() -> new RuntimeException("Não encontrou consoantes"));
		int consoanteIndex = chars.indexOf(consoante);
		String vogal = chars.subList(consoanteIndex, chars.size()).stream()
				.filter(vogalUnica(chars))
				.findFirst().orElseThrow(() -> new RuntimeException("Não encontrou vogais"));
		this.indexVogal = chars.indexOf(vogal);      
        System.out.println("Output "+ vogal);
    }
}
