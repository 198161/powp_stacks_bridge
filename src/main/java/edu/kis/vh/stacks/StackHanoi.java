package edu.kis.vh.stacks;

public class StackHanoi extends Stack {

public StackHanoi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StackHanoi(IStack stackList) {
		super(stackList);
		// TODO Auto-generated constructor stub
	}

private int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int valueToPush) {
		if (!isEmpty() && valueToPush > top())
			totalRejected++;
		else
			super.push(valueToPush);
	}
}