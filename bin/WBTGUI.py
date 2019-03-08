for i in range(121):
    print("JLabel label%i = new JLabel();\ngetContentPane().add(label%i);\nlabelList[%i][%i] = label%i;\n"%(i,i,i/11,i%11,i))
#print "{",
#for i in range(10):
#    print("{label%i, label%i, label%i, label%i, label%i, label%i, label%i, label%i, label%i, label%i}, "%\
#          (0+10*i, 1+10*i, 2+10*i, 3+10*i, 4+10*i, 5+10*i, 6+10*i, 7+10*i, 8+10*i, 9+10*i)),
#print "}"

#for i in "bImage, sWarrior, nWarrior, iFish, rFish, kFish, treasure, lotus, killWarrior, eatFin, compassion, gTreasure, eatLotus, useBinocular, finishImage".split(", "):
#    print("%s = new ImageIcon();\n"%str(i)),
