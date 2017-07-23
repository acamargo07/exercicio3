package br.com.exercico3.stream.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.exercicio3.stream.Stream;

public class StreamTest {

	@Test(expected = RuntimeException.class)
	public void testSemConsoante(){
		Stream str = new Stream("AaEeIiOoUu");
		str.processar();
	}
	
	@Test(expected = RuntimeException.class)
	public void testSemVogal(){
		Stream str = new Stream("SDFGsdfg");
		str.processar();
	}
	
	@Test(expected = RuntimeException.class)
	public void testeSemVogalAposConsoante(){
		Stream str = new Stream("AaEeIiOoUuwsQrtL");
		str.processar();
	}
	
	@Test
	public void testeAcharVogalRetonarFalseUltimoCaracter(){
		String input = "aAbBABacfeAfU";
		Stream stream = new Stream(input);
		int index = 0;
		do {
			stream.getNext();
			index++;
		}while(stream.hasNext());
		System.out.println(index);
		Assert.assertEquals(1, index);
	}
	
	@Test
	public void testeAcharVogalRetonarFalseSegundoCaracter(){
		String input = "WaEiOUbBBfeOIifU";
		Stream stream = new Stream(input);
		int index = 0;
		do {
			stream.getNext();
			index++;
		}while(stream.hasNext());
		Assert.assertEquals(1, index);
	}
}
