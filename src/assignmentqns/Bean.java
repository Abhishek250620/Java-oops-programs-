package assignmentqns;

public class Bean {
	private int runs;
	private int wickets;
	private String player;

	public Bean(int runs,int wickets,String player) {
		this.runs=runs;
		this.wickets=wickets;
		this.player=player;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}
}
