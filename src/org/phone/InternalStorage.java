package org.phone;
//child
public class InternalStorage {
	private void processorName() {
		System.out.println("snapdragon");
		}
    private void ramSize() {
    	System.out.println("8GB");
    	}
    public static void main(String[] args) {
    	ExternalStorage m = new ExternalStorage ();
    	m.size();
    	InternalStorage l = new InternalStorage ();
    	l.processorName();
    	l.ramSize();
    	
    }
    }
