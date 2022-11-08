package com.gl.javafsd.dsa.binarysearchtree.pairfinder;

public class BinarySearchTreePairFinderTest {

	public static void main(String[] args) {
		
		pairFinderTest(130);
		pairFinderTest(120);
		pairFinderTest(80);
		pairFinderTest(83);
		pairFinderTest(110);
		pairFinderTest(97);
		pairFinderTest(90);
		pairFinderTest(70);
		pairFinderTest(10);
		
	}
	
	static void pairFinderTest(int sum) {
				
		
		BinarySearchTree SampleTree 
			= BinarySearchTreeTest.sampleBinaryTree1();
		

		BinarySearchTreePairFinder finder =
			new BinarySearchTreePairFinder(SampleTree);
		
		finder.findPair(sum);
		System.out.println("--------------------------------------");
	}
}
