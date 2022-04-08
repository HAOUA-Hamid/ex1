package complexe;

import java.util.Collections;
import java.util.Comparator;

import complexe.Complexe;

public class Main {

	public static void main(String[] args) {
		
		Complexe c1=new Complexe(3, 1);
		Complexe c2=new Complexe(1, -1);
		Complexe c3=new Complexe(-1, 4);
		System.out.println(c1.equals(c1));
		ListComplexe list=new ListComplexe();
		System.out.println(list.add(c3));
		System.out.println(list.add(c2));
		System.out.println(list.add(c2));
		System.out.println(list.add(c1));
		System.out.println(list.somme());
		testListComplexe();
		

	}
	public static void testListComplexe() {
		Complexe c1=new Complexe(3, 1);
		Complexe c2=new Complexe(1, -1);
		Complexe c3=new Complexe(1, -1);
		ListComplexe list=new ListComplexe();
		list.add(c3);
		list.add(c2);
		list.add(c1);
			System.out.println(list);
		Collections.sort(list);
			System.out.println(list);
		Collections.sort(list,new imgComparator());
		System.out.println(list);
		Comparator<Complexe> comp=new Comparator<Complexe>() {

			@Override
			public int compare(Complexe o1, Complexe o2) {
				
				return -o1.compareTo(o2);
			}
			
		};
		Collections.sort(list,comp);
		System.out.println(list);
		
		Collections.sort(list, (c11, c22) -> -c11.compareTo(c22));
		
		list.stream().forEach(c -> System.out.println("*"+c));
	
		
	}
	}

