package com.PatternTest;

import com.State.Context;
import com.State.StartState;
import com.State.StopState;

public class StatePatternDemo {
	public static void main(String[] args) {
		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context); //只需要调用状态类里的该方法
		System.out.println(context.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction(context);  //只需要调用状态类里的该方法，替换之前的
		System.out.println(context.getState().toString());
	}
}
