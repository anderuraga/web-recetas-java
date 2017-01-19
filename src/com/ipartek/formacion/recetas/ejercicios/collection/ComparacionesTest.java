package com.ipartek.formacion.recetas.ejercicios.collection;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ipartek.formacion.recetas.pojo.Receta;

public class ComparacionesTest {

	ArrayList<Receta> recetas = new ArrayList<Receta>();
	Receta solomillo = new Receta("solomillo");
	Receta marmitako = new Receta("marmitako");
	Receta tortilla = new Receta("Torilla Patatas");
	
	@Before
	public void setUp() throws Exception {
		solomillo.setDificultad(Receta.MODERADO);
		marmitako.setDificultad(Receta.DIFICIL);
		tortilla.setDificultad(Receta.FACIL);
		
		recetas.add(solomillo);
		recetas.add(marmitako);
		recetas.add(tortilla);
	}

	@After
	public void tearDown() throws Exception {
		recetas = null;
		solomillo = null;
		tortilla = null;
		marmitako = null;
	}
	
	
	
	@Test
	public void testComparable() {
			
		//ordenar de A-Z
		Collections.sort(recetas);
		
		//comprobar
		assertEquals( marmitako, recetas.get(0));
		assertEquals( solomillo, recetas.get(1));
		assertEquals( tortilla, recetas.get(2));
		
		//ordenar de la Z-A
		Collections.sort(recetas, Collections.reverseOrder() );
		assertEquals( marmitako, recetas.get(2));
		assertEquals( solomillo, recetas.get(1));
		assertEquals( tortilla, recetas.get(0));
	
	}
	
	@Test
	public void testComparator() {
		
		 final String MSG_ERROR_DIFICULTAD = "NO ordena por nivel de dificultad";
		
		Collections.sort(recetas, new ComparatorRecetaNivelDificultad() );
		
		assertEquals(MSG_ERROR_DIFICULTAD, tortilla, recetas.get(0));
		assertEquals(MSG_ERROR_DIFICULTAD, solomillo, recetas.get(1));
		assertEquals(MSG_ERROR_DIFICULTAD, marmitako, recetas.get(2));
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
