
public class HanoiGame {
	public static void main(String[] args) {
		solve(4, 1, 3);
	}

	private static void solve(int disks, int startpole, int endpole) {
		int helpPole = 6 - (startpole + endpole);
		if (disks == 1) {
			System.out.println("Disk 1 from " + startpole + " --> " + endpole);
			return;
		} else {
			solve(disks - 1, startpole, helpPole);
			System.out.println("Disk " + disks + " from " + startpole + " --> " + helpPole);
			solve(disks - 1, helpPole, endpole);
		}
	}

}
