package com.gmail.vsyniakin.patterns.behavioral.state.states;

import com.gmail.vsyniakin.patterns.behavioral.state.State;
import com.gmail.vsyniakin.patterns.behavioral.state.User;

public class Free implements State {

	public void view(User context) {
		context.setView("Free");
		System.out.println(context.getName() + " is " + context.getView());
	}

	
}
