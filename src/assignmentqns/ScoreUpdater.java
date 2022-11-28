package assignmentqns;

public class ScoreUpdater {
	public static void main(String[] args) {
		Bean b=new Bean(29,0,"chahal");
		System.out.println(b.getRuns());
		System.out.println(b.getWickets());
		System.out.println(b.getPlayer());
		b.setRuns(28);
		System.out.println(b.getRuns());
	}

}
