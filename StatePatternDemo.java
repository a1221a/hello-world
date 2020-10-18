package com.PatternTest;

import com.State.Context;
import com.State.StartState;
import com.State.StopState;

public class StatePatternDemo {
	public static void main(String[] args) {
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context); //ֻ��Ҫ����״̬����ĸ÷���
		System.out.println(context.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction(context);  //ֻ��Ҫ����״̬����ĸ÷������滻֮ǰ��
		System.out.println(context.getState().toString());
	}
}
