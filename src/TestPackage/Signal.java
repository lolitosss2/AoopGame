package TestPackage;import javax.swing.*;

import java.awt.List;
import java.awt.event.*;
import java.util.ArrayList;

public class Signal{
	private double amplitude;
	private final int SAMPLING = 1000;
	private ArrayList<SignalObserver> myObservers;
	private Sampler theSampler;


	public void addObserver(SignalObserver s) {
		myObservers.add(s);
	}

	public int setSampler(int x){
		return x;
	}


	public void setTheSampler(Sampler aSampler) {
		theSampler = aSampler;
	}


	public Signal() {
		myObservers = new ArrayList<SignalObserver>();
		theSampler = new DefaultSampler2();

		Timer t = new Timer(SAMPLING, new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amplitude =  theSampler.read();
				nextValue(amplitude);
			}
		});
		t.start();
	}

	private void nextValue(double x) {
		for (SignalObserver so : myObservers) {
			so.updateSignal(x);
		}		
	}
}