package main;

import java.util.List;

public class BinarySearchTree<T extends Comparable<? super T>> implements SearchTree<T> {
	int size;
	Node<T> root;
	@Override
	public void add(T item) {
		// TODO Auto-generated method stub
		if(root == null) {
			Node<T> newNode = new Node<>(item, null, null);
			root = newNode;
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(T item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T getMax() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T getMin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> postOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> preOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> inOrder() {
		// TODO Auto-generated method stub
		return null;
	}
}