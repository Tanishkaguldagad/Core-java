package MusicInstrument.java;
class MusicInstrument 
{

	    String name;
	    String type;

	    MusicInstrument(String name, String type) 
	    {
	        this.name = name;
	        this.type = type;
	    }

	    void play() 
	    {
	        System.out.println("Playing a music instrument...");
	    }

	    public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		void display() 
	    {
	        System.out.println("Instrument Name: " + name);
	        System.out.println("Instrument Type: " + type);
	    }
	}


	class Guitar extends MusicInstrument 
	{
	    int numberOfStrings;

	    Guitar(String name, String type, int numberOfStrings) 
	    {
	        super(name, type);
	        this.numberOfStrings = numberOfStrings;
	    }

	    @Override
	    void play() 
	    {
	        System.out.println("Strumming the guitar");
	    }

	    @Override
	    void display() 
	    {
	        super.display();
	        System.out.println("Strings: " + numberOfStrings);
	    }
	}

	class Piano extends MusicInstrument 
	{
	    int numberOfKeys;

	    Piano(String name, String type, int numberOfKeys) 
	    {
	        super(name, type);
	        this.numberOfKeys = numberOfKeys;
	    }

	    
	    void play() 
	    {
	        System.out.println("Playing the piano keys");
	    }

	    
	    public int getNumberOfKeys() {
			return numberOfKeys;
		}


		public void setNumberOfKeys(int numberOfKeys) {
			this.numberOfKeys = numberOfKeys;
		}


		void display() 
	    {
	        super.display();
	        System.out.println("Keys: " + numberOfKeys);
	    }
	}

	class Drum extends MusicInstrument 
	{
	    String drumType;

	    Drum(String name, String type, String drumType) 
	    {
	        super(name, type);
	        this.drumType = drumType;
	    }

	  
	    public String getDrumType() {
			return drumType;
		}


		public void setDrumType(String drumType) {
			this.drumType = drumType;
		}


		void play() 
	    {
	        System.out.println("Beating the drums");
	    }

	
	    void display() 
	    {
	        super.display();
	        System.out.println("Drum Type: " + drumType);
	    }
	}

	class MusicDemo 
	{
	    public static void main(String[] args) 
	    {
	        System.out.println("Polymorphism in Music Instruments:\n");

	        MusicInstrument ref;

	    
	        ref = new Guitar("Acoustic Guitar", "String Instrument", 6);
	        System.out.println("\nUsing MusicInstrument reference for Guitar:");
	        ref.play();
	        ref.display();

	      
	        ref = new Piano("Grand Piano", "Keyboard Instrument", 88);
	        System.out.println("\nUsing MusicInstrument reference for Piano:");
	        ref.play();
	        ref.display();

	
	        ref = new Drum("Bass Drum", "Percussion Instrument", "Double-Sided");
	        System.out.println("\nUsing MusicInstrument reference for Drum:");
	        ref.play();
	        ref.display();
	    }
	}

