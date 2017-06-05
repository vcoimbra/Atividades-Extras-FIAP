package br.com.fiap.Trabalho3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.WeakHashMap;

public class Exercicio3 {

	public static void main(String[] args) {
		int max = 1000000;
		int buscar = max/2;
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		Set<Integer> hashSet = new HashSet<>();
		Map<Integer, Integer> hashMap = new HashMap<>();
		Map<Integer, Integer> weakHashMap = new WeakHashMap<>();
		LocalDateTime inicio;
		LocalDateTime fim;
		
		Long tempoArrayList;
		Long tempoLinkedList;
		Long tempoStack;
		Long tempoHashSet;
		Long tempoHashMap;
		Long tempoWeakHashMap;
		
		//ArrayList
		inicio = LocalDateTime.now();
		for (int i = 0; i < max; i++) {
			arrayList.add(i);
		}
		arrayList.get(buscar);
		fim = LocalDateTime.now();		
		tempoArrayList = ChronoUnit.MILLIS.between(inicio, fim);
		
		//LinkedList
		inicio = LocalDateTime.now();
		for (int i = 0; i < max; i++) {
			linkedList.add(i);
		}
		linkedList.get(buscar);
		fim = LocalDateTime.now();		
		tempoLinkedList = ChronoUnit.MILLIS.between(inicio, fim);
		
		//Stack
		inicio = LocalDateTime.now();
		for (int i = 0; i < max; i++) {
			stack.add(i);
		}
		stack.get(buscar);
		fim = LocalDateTime.now();		
		tempoStack = ChronoUnit.MILLIS.between(inicio, fim);
		
		//HashSet
		inicio = LocalDateTime.now();
		for (int i = 0; i < max; i++) {
			hashSet.add(i);
		}
		hashSet.contains(buscar);
		fim = LocalDateTime.now();		
		tempoHashSet = ChronoUnit.MILLIS.between(inicio, fim);
		
		//HashMap
		inicio = LocalDateTime.now();
		for (int i = 0; i < max; i++) {
			hashMap.put(i, i);
		}
		hashMap.get(buscar);
		fim = LocalDateTime.now();		
		tempoHashMap = ChronoUnit.MILLIS.between(inicio, fim);
		
		//WeakHashMap
		inicio = LocalDateTime.now();
		for (int i = 0; i < max; i++) {
			weakHashMap.put(i,i);
		}
		weakHashMap.get(buscar);
		fim = LocalDateTime.now();		
		tempoWeakHashMap = ChronoUnit.MILLIS.between(inicio, fim);
		
		//Saidas
		System.out.println("A) Tempo ArrayList: " + tempoArrayList + " X Tempo LinkedList: " + tempoLinkedList);
		System.out.println("B) Tempo Stack: " + tempoStack + " X Tempo HashSet: " + tempoHashSet);
		System.out.println("C) Tempo HashMap: " + tempoHashMap + " X Tempo WeakHashMap: " + tempoWeakHashMap);
	}
}
