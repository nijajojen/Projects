package com.nija.base;

public class EngineExecutor {
	
	public static void main(String[] s) {
		
		EngineExecutor executor = new EngineExecutor();
		executor.executeAEngine(new AEngine());
		executor.executeBEngine(new BEngine());

		executor.executeCEngine(new CEgine());

		executor.executeEngine(new AEngine());
		executor.executeEngine(new BEngine());

		executor.executeEngine(new CEgine());

	}

	
	public void executeAEngine(AEngine aengine) {
		//validate Engine Oil
		//Validate Engine condition
		//Validate engine heat
		
		//if all ok start Engine
		aengine.start();
		
	}
	
	
	public void executeBEngine(BEngine bengine) {
		//validate Engine Oil
		//Validate Engine condition
		//Validate engine heat
		
		//if all ok start Engine
		bengine.start();
		
	}
	
	
	public void executeCEngine(CEgine cengine) {
		//validate Engine Oil
		//Validate Engine condition
		//Validate engine heat
		
		//if all ok start Engine
		cengine.start();
		
	}
	
	public void executeEngine(BaseEngine engine) {
		//validate Engine Oil
		//Validate Engine condition
		//Validate engine heat
		
		//if all ok start Engine
		engine.start();
		
	}
}
