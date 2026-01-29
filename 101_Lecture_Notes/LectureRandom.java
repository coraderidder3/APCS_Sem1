/*
    Lecture note example - Random!!
*/

class LectureRandom{
    public static void main(String args[]) {
    
       
    
        System.out.println(Math.random()*5);    //0-5
        
        System.out.println(Math.random()*20+15);    //15-35
        
        System.out.println(Math.random()*10001+5234);   //5234-15235
        
        double random1 = Math.random()*50+30;
        double random2 = Math.random()*50+90;
        System.out.println((int)(Math.random()*(random2-random1)+random1));      //int ((30,80),(90,140))
        
        
        
        
	}
}
