package final_WBT;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.io.File;
import java.io.IOException;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.Color;

public class GUI extends JFrame {
	ImageIcon bImage, sWarrior, nWarrior, iFish, rFish, kFish, treasure, lotus, killWarrior, eatFin, compassion,
			gTreasure, eatLotus, useBinocular, finishImage;
	JLabel[][] labelList;

	AudioInputStream[] soundList;
	Clip clip1, clip2;

	public GUI() {
		labelList = new JLabel[11][11];
		this.setResizable(false);
		getContentPane().setBackground(Color.WHITE);
		// setBackground(Color.RED);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(820, 820);
		this.setTitle("Warrior Bring Treasure");
		this.getContentPane().setLayout(new GridLayout(11, 11, 2, 2));
		this.setLocationRelativeTo(null);

		String path = new File("").getAbsolutePath() + "\\src\\final_WBT\\";
		bImage = new ImageIcon(path + "blabel.gif");
		sWarrior = new ImageIcon(path + "swarrior.gif");
		nWarrior = new ImageIcon(path + "nwarrior.gif");
		iFish = new ImageIcon(path + "ifish.gif");
		rFish = new ImageIcon(path + "rfish.gif");
		kFish = new ImageIcon(path + "kfish.gif");
		treasure = new ImageIcon(path + "treasure.gif");
		lotus = new ImageIcon(path + "lotus.gif");
		killWarrior = new ImageIcon(path + "killwarrior.gif");
		eatFin = new ImageIcon(path + "eatfin.gif");
		compassion = new ImageIcon(path + "compassion.gif");
		gTreasure = new ImageIcon(path + "gtreasure.gif");
		eatLotus = new ImageIcon(path + "eatlotus.gif");
		useBinocular = new ImageIcon();
		finishImage = new ImageIcon(path + "finishimage.gif");

		JLabel label0 = new JLabel();
		getContentPane().add(label0);
		labelList[0][0] = label0;

		JLabel label1 = new JLabel();
		getContentPane().add(label1);
		labelList[0][1] = label1;

		JLabel label2 = new JLabel();
		getContentPane().add(label2);
		labelList[0][2] = label2;

		JLabel label3 = new JLabel();
		getContentPane().add(label3);
		labelList[0][3] = label3;

		JLabel label4 = new JLabel();
		getContentPane().add(label4);
		labelList[0][4] = label4;

		JLabel label5 = new JLabel();
		getContentPane().add(label5);
		labelList[0][5] = label5;

		JLabel label6 = new JLabel();
		getContentPane().add(label6);
		labelList[0][6] = label6;

		JLabel label7 = new JLabel();
		getContentPane().add(label7);
		labelList[0][7] = label7;

		JLabel label8 = new JLabel();
		getContentPane().add(label8);
		labelList[0][8] = label8;

		JLabel label9 = new JLabel();
		getContentPane().add(label9);
		labelList[0][9] = label9;

		JLabel label10 = new JLabel();
		getContentPane().add(label10);
		labelList[0][10] = label10;

		JLabel label11 = new JLabel();
		getContentPane().add(label11);
		labelList[1][0] = label11;

		JLabel label12 = new JLabel();
		getContentPane().add(label12);
		labelList[1][1] = label12;

		JLabel label13 = new JLabel();
		getContentPane().add(label13);
		labelList[1][2] = label13;

		JLabel label14 = new JLabel();
		getContentPane().add(label14);
		labelList[1][3] = label14;

		JLabel label15 = new JLabel();
		getContentPane().add(label15);
		labelList[1][4] = label15;

		JLabel label16 = new JLabel();
		getContentPane().add(label16);
		labelList[1][5] = label16;

		JLabel label17 = new JLabel();
		getContentPane().add(label17);
		labelList[1][6] = label17;

		JLabel label18 = new JLabel();
		getContentPane().add(label18);
		labelList[1][7] = label18;

		JLabel label19 = new JLabel();
		getContentPane().add(label19);
		labelList[1][8] = label19;

		JLabel label20 = new JLabel();
		getContentPane().add(label20);
		labelList[1][9] = label20;

		JLabel label21 = new JLabel();
		getContentPane().add(label21);
		labelList[1][10] = label21;

		JLabel label22 = new JLabel();
		getContentPane().add(label22);
		labelList[2][0] = label22;

		JLabel label23 = new JLabel();
		getContentPane().add(label23);
		labelList[2][1] = label23;

		JLabel label24 = new JLabel();
		getContentPane().add(label24);
		labelList[2][2] = label24;

		JLabel label25 = new JLabel();
		getContentPane().add(label25);
		labelList[2][3] = label25;

		JLabel label26 = new JLabel();
		getContentPane().add(label26);
		labelList[2][4] = label26;

		JLabel label27 = new JLabel();
		getContentPane().add(label27);
		labelList[2][5] = label27;

		JLabel label28 = new JLabel();
		getContentPane().add(label28);
		labelList[2][6] = label28;

		JLabel label29 = new JLabel();
		getContentPane().add(label29);
		labelList[2][7] = label29;

		JLabel label30 = new JLabel();
		getContentPane().add(label30);
		labelList[2][8] = label30;

		JLabel label31 = new JLabel();
		getContentPane().add(label31);
		labelList[2][9] = label31;

		JLabel label32 = new JLabel();
		getContentPane().add(label32);
		labelList[2][10] = label32;

		JLabel label33 = new JLabel();
		getContentPane().add(label33);
		labelList[3][0] = label33;

		JLabel label34 = new JLabel();
		getContentPane().add(label34);
		labelList[3][1] = label34;

		JLabel label35 = new JLabel();
		getContentPane().add(label35);
		labelList[3][2] = label35;

		JLabel label36 = new JLabel();
		getContentPane().add(label36);
		labelList[3][3] = label36;

		JLabel label37 = new JLabel();
		getContentPane().add(label37);
		labelList[3][4] = label37;

		JLabel label38 = new JLabel();
		getContentPane().add(label38);
		labelList[3][5] = label38;

		JLabel label39 = new JLabel();
		getContentPane().add(label39);
		labelList[3][6] = label39;

		JLabel label40 = new JLabel();
		getContentPane().add(label40);
		labelList[3][7] = label40;

		JLabel label41 = new JLabel();
		getContentPane().add(label41);
		labelList[3][8] = label41;

		JLabel label42 = new JLabel();
		getContentPane().add(label42);
		labelList[3][9] = label42;

		JLabel label43 = new JLabel();
		getContentPane().add(label43);
		labelList[3][10] = label43;

		JLabel label44 = new JLabel();
		getContentPane().add(label44);
		labelList[4][0] = label44;

		JLabel label45 = new JLabel();
		getContentPane().add(label45);
		labelList[4][1] = label45;

		JLabel label46 = new JLabel();
		getContentPane().add(label46);
		labelList[4][2] = label46;

		JLabel label47 = new JLabel();
		getContentPane().add(label47);
		labelList[4][3] = label47;

		JLabel label48 = new JLabel();
		getContentPane().add(label48);
		labelList[4][4] = label48;

		JLabel label49 = new JLabel();
		getContentPane().add(label49);
		labelList[4][5] = label49;

		JLabel label50 = new JLabel();
		getContentPane().add(label50);
		labelList[4][6] = label50;

		JLabel label51 = new JLabel();
		getContentPane().add(label51);
		labelList[4][7] = label51;

		JLabel label52 = new JLabel();
		getContentPane().add(label52);
		labelList[4][8] = label52;

		JLabel label53 = new JLabel();
		getContentPane().add(label53);
		labelList[4][9] = label53;

		JLabel label54 = new JLabel();
		getContentPane().add(label54);
		labelList[4][10] = label54;

		JLabel label55 = new JLabel();
		getContentPane().add(label55);
		labelList[5][0] = label55;

		JLabel label56 = new JLabel();
		getContentPane().add(label56);
		labelList[5][1] = label56;

		JLabel label57 = new JLabel();
		getContentPane().add(label57);
		labelList[5][2] = label57;

		JLabel label58 = new JLabel();
		getContentPane().add(label58);
		labelList[5][3] = label58;

		JLabel label59 = new JLabel();
		getContentPane().add(label59);
		labelList[5][4] = label59;

		JLabel label60 = new JLabel();
		getContentPane().add(label60);
		labelList[5][5] = label60;

		JLabel label61 = new JLabel();
		getContentPane().add(label61);
		labelList[5][6] = label61;

		JLabel label62 = new JLabel();
		getContentPane().add(label62);
		labelList[5][7] = label62;

		JLabel label63 = new JLabel();
		getContentPane().add(label63);
		labelList[5][8] = label63;

		JLabel label64 = new JLabel();
		getContentPane().add(label64);
		labelList[5][9] = label64;

		JLabel label65 = new JLabel();
		getContentPane().add(label65);
		labelList[5][10] = label65;

		JLabel label66 = new JLabel();
		getContentPane().add(label66);
		labelList[6][0] = label66;

		JLabel label67 = new JLabel();
		getContentPane().add(label67);
		labelList[6][1] = label67;

		JLabel label68 = new JLabel();
		getContentPane().add(label68);
		labelList[6][2] = label68;

		JLabel label69 = new JLabel();
		getContentPane().add(label69);
		labelList[6][3] = label69;

		JLabel label70 = new JLabel();
		getContentPane().add(label70);
		labelList[6][4] = label70;

		JLabel label71 = new JLabel();
		getContentPane().add(label71);
		labelList[6][5] = label71;

		JLabel label72 = new JLabel();
		getContentPane().add(label72);
		labelList[6][6] = label72;

		JLabel label73 = new JLabel();
		getContentPane().add(label73);
		labelList[6][7] = label73;

		JLabel label74 = new JLabel();
		getContentPane().add(label74);
		labelList[6][8] = label74;

		JLabel label75 = new JLabel();
		getContentPane().add(label75);
		labelList[6][9] = label75;

		JLabel label76 = new JLabel();
		getContentPane().add(label76);
		labelList[6][10] = label76;

		JLabel label77 = new JLabel();
		getContentPane().add(label77);
		labelList[7][0] = label77;

		JLabel label78 = new JLabel();
		getContentPane().add(label78);
		labelList[7][1] = label78;

		JLabel label79 = new JLabel();
		getContentPane().add(label79);
		labelList[7][2] = label79;

		JLabel label80 = new JLabel();
		getContentPane().add(label80);
		labelList[7][3] = label80;

		JLabel label81 = new JLabel();
		getContentPane().add(label81);
		labelList[7][4] = label81;

		JLabel label82 = new JLabel();
		getContentPane().add(label82);
		labelList[7][5] = label82;

		JLabel label83 = new JLabel();
		getContentPane().add(label83);
		labelList[7][6] = label83;

		JLabel label84 = new JLabel();
		getContentPane().add(label84);
		labelList[7][7] = label84;

		JLabel label85 = new JLabel();
		getContentPane().add(label85);
		labelList[7][8] = label85;

		JLabel label86 = new JLabel();
		getContentPane().add(label86);
		labelList[7][9] = label86;

		JLabel label87 = new JLabel();
		getContentPane().add(label87);
		labelList[7][10] = label87;

		JLabel label88 = new JLabel();
		getContentPane().add(label88);
		labelList[8][0] = label88;

		JLabel label89 = new JLabel();
		getContentPane().add(label89);
		labelList[8][1] = label89;

		JLabel label90 = new JLabel();
		getContentPane().add(label90);
		labelList[8][2] = label90;

		JLabel label91 = new JLabel();
		getContentPane().add(label91);
		labelList[8][3] = label91;

		JLabel label92 = new JLabel();
		getContentPane().add(label92);
		labelList[8][4] = label92;

		JLabel label93 = new JLabel();
		getContentPane().add(label93);
		labelList[8][5] = label93;

		JLabel label94 = new JLabel();
		getContentPane().add(label94);
		labelList[8][6] = label94;

		JLabel label95 = new JLabel();
		getContentPane().add(label95);
		labelList[8][7] = label95;

		JLabel label96 = new JLabel();
		getContentPane().add(label96);
		labelList[8][8] = label96;

		JLabel label97 = new JLabel();
		getContentPane().add(label97);
		labelList[8][9] = label97;

		JLabel label98 = new JLabel();
		getContentPane().add(label98);
		labelList[8][10] = label98;

		JLabel label99 = new JLabel();
		getContentPane().add(label99);
		labelList[9][0] = label99;

		JLabel label100 = new JLabel();
		getContentPane().add(label100);
		labelList[9][1] = label100;

		JLabel label101 = new JLabel();
		getContentPane().add(label101);
		labelList[9][2] = label101;

		JLabel label102 = new JLabel();
		getContentPane().add(label102);
		labelList[9][3] = label102;

		JLabel label103 = new JLabel();
		getContentPane().add(label103);
		labelList[9][4] = label103;

		JLabel label104 = new JLabel();
		getContentPane().add(label104);
		labelList[9][5] = label104;

		JLabel label105 = new JLabel();
		getContentPane().add(label105);
		labelList[9][6] = label105;

		JLabel label106 = new JLabel();
		getContentPane().add(label106);
		labelList[9][7] = label106;

		JLabel label107 = new JLabel();
		getContentPane().add(label107);
		labelList[9][8] = label107;

		JLabel label108 = new JLabel();
		getContentPane().add(label108);
		labelList[9][9] = label108;

		JLabel label109 = new JLabel();
		getContentPane().add(label109);
		labelList[9][10] = label109;

		JLabel label110 = new JLabel();
		getContentPane().add(label110);
		labelList[10][0] = label110;

		JLabel label111 = new JLabel();
		getContentPane().add(label111);
		labelList[10][1] = label111;

		JLabel label112 = new JLabel();
		getContentPane().add(label112);
		labelList[10][2] = label112;

		JLabel label113 = new JLabel();
		getContentPane().add(label113);
		labelList[10][3] = label113;

		JLabel label114 = new JLabel();
		getContentPane().add(label114);
		labelList[10][4] = label114;

		JLabel label115 = new JLabel();
		getContentPane().add(label115);
		labelList[10][5] = label115;

		JLabel label116 = new JLabel();
		getContentPane().add(label116);
		labelList[10][6] = label116;

		JLabel label117 = new JLabel();
		getContentPane().add(label117);
		labelList[10][7] = label117;

		JLabel label118 = new JLabel();
		getContentPane().add(label118);
		labelList[10][8] = label118;

		JLabel label119 = new JLabel();
		getContentPane().add(label119);
		labelList[10][9] = label119;

		JLabel label120 = new JLabel();
		getContentPane().add(label120);
		labelList[10][10] = label120;

		initialSetup();
		setVisible(true);

	}

	public void resetNode(int x, int y) {
		labelList[10 - y][x].setIcon(bImage);
	}

	public void setNormalWarrior(int x, int y) {
		SoundEffect.SWIM.play();
		labelList[10 - y][x].setIcon(nWarrior);
	}

	public void setSuperlWarrior(int x, int y) {
		SoundEffect.SWIM.play();
		labelList[10 - y][x].setIcon(sWarrior);
	}

	public void setTreasure(int x, int y) {
		labelList[10 - y][x].setIcon(treasure);
	}

	public void setLotus(int x, int y) {
		labelList[10 - y][x].setIcon(lotus);
	}

	public void setInnocentFish(int x, int y) {
		labelList[10 - y][x].setIcon(iFish);
	}

	public void setRubberFish(int x, int y) {
		labelList[10 - y][x].setIcon(rFish);
	}

	public void setKillerFish(int x, int y) {
		labelList[10 - y][x].setIcon(kFish);
	}

	public void setKillWarrior(int x, int y) {
		SoundEffect.KILL.play();
		labelList[10 - y][x].setIcon(killWarrior);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		labelList[10 - y][x].setIcon(kFish);
	}

	public void setEatFin(int x, int y) {
		SoundEffect.EAT_FIN.play();
		labelList[10 - y][x].setIcon(eatFin);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		labelList[10 - y][x].setIcon(rFish);
	}

	public void setCompassion(int x, int y) {
		labelList[10 - y][x].setIcon(compassion);
	}

	public void setGrabTreasure(int x, int y) {
		SoundEffect.GRAB.play();
		labelList[10 - y][x].setIcon(gTreasure);
	}

	public void setEatLotus(int x, int y) {
		SoundEffect.EAT_LOTUS.play();
		labelList[10 - y][x].setIcon(eatLotus);
	}

	public void setUsingBinocular(int x, int y) {
		labelList[10 - y][x].setIcon(bImage);
	}

	public void setGameFinished() {
		SoundEffect.FINISH.play();
		for (JLabel[] j : labelList) {
			for (JLabel i : j) {
				i.setIcon(finishImage);
			}
		}
	}

	public void initialSetup() {
		for (JLabel[] j : labelList) {
			for (JLabel i : j) {
				i.setIcon(bImage);
			}
		}
	}
}

enum SoundEffect {

	KILL("killwarrior.wav"), EAT_FIN("eatfin.wav"), EAT_LOTUS("eatlotus.wav"), GRAB("grab.wav"), SWIM(
			"swim.wav"), FINISH("finish.wav");

	private Clip clip;
	String path = new File("").getAbsolutePath() + "\\src\\final_WBT\\";

	SoundEffect(String soundFileName) {
		try {
			File file = new File(path + soundFileName);
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
		} catch (Exception e) {
		}
	}

	public void play() {
		if (clip.isRunning())
			clip.stop();
		clip.setFramePosition(0);
		clip.start();

	}

	static void init() {
		values(); // to pre load all sound files to memory.
	}
}