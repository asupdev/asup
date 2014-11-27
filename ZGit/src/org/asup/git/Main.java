package org.asup.git;


public class Main {

	public static void main(String[] args) throws Exception {
		Coppia<String, String> login = Login.login();
		GitRest gitRest = new GitRest("https://api.github.com/", login.x(), login.y());
		System.out.println(gitRest.getArray("issues").toString(2));
	}

}
