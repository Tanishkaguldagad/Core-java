package SocialMedia;

 class SocialMedia
 {
	     String userName;
	     String email;
	     String isPublic;
	     String isVerified;

	     SocialMedia() {
	         this.userName = "Tanishka";
	         this.email = "xyz@gmail.com";
	         this.isPublic = "Yes";
	         this.isVerified = "Yes";
	     }

	     SocialMedia(String userName, String email, String isPublic, String isVerified) {
	         this.userName = userName;
	         this.email = email;
	         this.isPublic = isPublic;
	         this.isVerified = isVerified;
	     }

	     void display() {
	         System.out.println("userName: " + this.userName);
	         System.out.println("email: " + this.email);
	         System.out.println("isPublic: " + this.isPublic);
	         System.out.println("isVerified: " + this.isVerified);
	     }
	 }

	 class Instagram extends SocialMedia {
	     int noofFollowers;
	     int noofFollowing;
	     int noofHighlights;
	     int noofPost;

	     Instagram() {
	         this.noofFollowers = 345;
	         this.noofFollowing = 456;
	         this.noofHighlights = 34;
	         this.noofPost = 123;
	     }

	     Instagram(String userName, String email, String isPublic, String isVerified, 
	               int noofFollowers, int noofFollowing, int noofHighlights, int noofPost) {
	         super(userName, email, isPublic, isVerified);
	         this.noofFollowers = noofFollowers;
	         this.noofFollowing = noofFollowing;
	         this.noofHighlights = noofHighlights;
	         this.noofPost = noofPost;
	     }

	     public int getNoofFollowers() {
			return noofFollowers;
		}

		public void setNoofFollowers(int noofFollowers) {
			this.noofFollowers = noofFollowers;
		}

		public int getNoofFollowing() {
			return noofFollowing;
		}

		public void setNoofFollowing(int noofFollowing) {
			this.noofFollowing = noofFollowing;
		}

		public int getNoofHighlights() {
			return noofHighlights;
		}

		public void setNoofHighlights(int noofHighlights) {
			this.noofHighlights = noofHighlights;
		}

		public int getNoofPost() {
			return noofPost;
		}

		public void setNoofPost(int noofPost) {
			this.noofPost = noofPost;
		}

		void display() {
	         super.display();
	         System.out.println("noofFollowers: " + this.noofFollowers);
	         System.out.println("noofFollowing: " + this.noofFollowing);
	         System.out.println("noofHighlights: " + this.noofHighlights);
	         System.out.println("noofPost: " + this.noofPost);
	     }
	 }

	 class YouTube extends SocialMedia {
	     int videosPerDay;
	     int subscribers;

	     YouTube() {
	         super("YT_User", "yt@gmail.com", "Yes", "Yes");
	         this.videosPerDay = 1000;
	         this.subscribers = 20000;
	     }

	     YouTube(String userName, String email, String isPublic, String isVerified, int videosPerDay, int subscribers) {
	         super(userName, email, isPublic, isVerified);
	         this.videosPerDay = videosPerDay;
	         this.subscribers = subscribers;
	     }

	     public int getVideosPerDay() {
			return videosPerDay;
		}

		public void setVideosPerDay(int videosPerDay) {
			this.videosPerDay = videosPerDay;
		}

		public int getSubscribers() {
			return subscribers;
		}

		public void setSubscribers(int subscribers) {
			this.subscribers = subscribers;
		}

		void display() {
	         super.display();
	         System.out.println("videosPerDay: " + this.videosPerDay);
	         System.out.println("subscribers: " + this.subscribers);
	     }
	 }

	 class SocialMediaDemo {
	     public static void main(String[] args) {
	         System.out.println("Default Instagram User:");
	         Instagram i1 = new Instagram();
	         i1.display();

	         System.out.println("\nParameterized Instagram User:");
	         Instagram i2 = new Instagram("Tanu", "tanu@insta.com", "Yes", "No", 5000, 300, 15, 120);
	         i2.display();

	         System.out.println("\nYouTube Channel Info:");
	         YouTube yt = new YouTube("TanuYT", "tanuyt@gmail.com", "Yes", "Yes", 50, 100000);
	         yt.display();
	     }
	 }
