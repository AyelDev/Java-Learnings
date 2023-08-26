package com.OOPlvl2InterfaceComplexAlgo;

public class Project {

	interface Test {
		void nothing();
		default void nothing1() {
			
		}
	}

	class Class1 implements Test {

		@Override
		public void nothing() {
			// TODO Auto-generated method stub

		}
	}

	class Class2 implements Test {

		@Override
		public void nothing() {
			// TODO Auto-generated method stub

		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexAlgorithm algorith = new RealAlgorithm();
		System.out.println(algorith.complexAlgorithm(10, 20));

	}

}
