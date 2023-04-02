package FactoryDesginInterface;

public class FactoryPlan {

	public OperatingSystem getPlan(String OStype) {
		if (OStype.equalsIgnoreCase("windows")) {
			return new WindowsClass();

		}
		else if (OStype.equalsIgnoreCase("Android")) {
			return new AndroidClass();

		}
		else if (OStype.equalsIgnoreCase("ios")) {
			return new iosClass();

		}
		else {
			return new WindowsClass();

		}

	}
}
