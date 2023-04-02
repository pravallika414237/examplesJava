package FacadeDp;

public class TravelAgent {
private BudgetPack bp;
private GoldPack gp;
private LuxuryPack lp;

public void getBp() {
	bp= new BudgetPack();
	bp.getTravelPackage();
}

public void getGp() {
	gp= new GoldPack();
	gp.getTravelPackage();
}

public void getLp() {
	lp= new LuxuryPack();
	lp.getTravelPackage();
}


}
