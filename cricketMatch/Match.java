public abstract class Match {

    private int run;
    private float over;
    private int target;

    // public void odi(int run, float over, int target)
    // {
    //     // super();
    //     this.run = run;
    //     this.over = over;
    //     this.target = target;
    // }

    // public int getRun() {
	// 	return run;
	// }
	// public void setRun(int run) {
	// 	this.run = run;
	// }

    // public float getOver() {
	// 	return over;
	// }
	// public void setOver (float over) {
	// 	this.over = over ;
	// }

    // public int getTarget() {
	// 	return target;
	// }
	// public void setTarget (int target) {
	// 	this.target = target ;
	// }
}

class ODI extends Match{

	public ODI(int scr, float ovr, int trg) {
        System.out.println("---------- : Requirements : --------");
        int  need = (trg-scr);
        float needrr = need / (50-ovr);
        float balls = (50 - ovr) * 6;
        int ballsInt = (int)Math.round(balls);
        System.out.println("Needed " + need + " runs in " + ballsInt + " balls");
        System.out.println("Required RR " + needrr); 
	}
}

class T20I extends Match{

	public T20I(int scr, float ovr, int trg) {
        System.out.println("---------- : Requirements : --------");
        int  need = (trg-scr);
        float needrr = need / (20-ovr);
        float balls = (20 - ovr) * 6;
        int ballsInt = (int)Math.round(balls);
        System.out.println("Needed " + need + " runs in " + ballsInt + " balls");
        System.out.println("Required RR " + needrr); 
	}
}

class Test extends Match{

	public Test(int scr, float ovr, int trg) {
        System.out.println("---------- : Requirements : --------");
        int  need = (trg-scr);
        float needrr = need / (90-ovr);
        float balls = (90 - ovr) * 6;
        int ballsInt = (int)Math.round(balls);
        System.out.println("Needed " + need + " runs in " + ballsInt + " balls");
        System.out.println("Required RR " + needrr); 
	}
}
