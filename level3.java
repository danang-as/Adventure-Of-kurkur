import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3 extends World
{

    /**
     * Constructor for objects of class level3.
     * 
     */
    public level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        kurkur kurkur = new kurkur();
        addObject(kurkur,27,379);
        rintangan rintangan = new rintangan();
        addObject(rintangan,7,329);
        rintangan rintangan2 = new rintangan();
        addObject(rintangan2,52,330);
        rintangan rintangan3 = new rintangan();
        addObject(rintangan3,98,331);
        rintangan rintangan4 = new rintangan();
        addObject(rintangan4,205,397);
        rintangan rintangan5 = new rintangan();
        addObject(rintangan5,204,358);
        rintangan5.setLocation(203,336);
        rintangan rintangan6 = new rintangan();
        addObject(rintangan6,203,336);
        rintangan rintangan7 = new rintangan();
        addObject(rintangan7,302,341);
        rintangan rintangan8 = new rintangan();
        addObject(rintangan8,347,341);
        rintangan rintangan9 = new rintangan();
        addObject(rintangan9,392,342);
        rintangan rintangan10 = new rintangan();
        addObject(rintangan10,433,342);
        rintangan rintangan11 = new rintangan();
        addObject(rintangan11,203,237);
        rintangan rintangan12 = new rintangan();
        addObject(rintangan12,157,237);
        rintangan rintangan13 = new rintangan();
        addObject(rintangan13,109,239);
        rintangan rintangan14 = new rintangan();
        addObject(rintangan14,64,239);
        rintangan rintangan15 = new rintangan();
        addObject(rintangan15,250,237);
        rintangan rintangan16 = new rintangan();
        addObject(rintangan16,436,388);
        rintangan rintangan17 = new rintangan();
        addObject(rintangan17,481,342);
        rintangan rintangan18 = new rintangan();
        addObject(rintangan18,530,341);
        rintangan rintangan19 = new rintangan();
        addObject(rintangan19,297,237);
        rintangan rintangan20 = new rintangan();
        addObject(rintangan20,344,239);
        rintangan rintangan21 = new rintangan();
        addObject(rintangan21,449,241);
        rintangan rintangan22 = new rintangan();
        addObject(rintangan22,496,242);
        rintangan rintangan23 = new rintangan();
        addObject(rintangan23,541,242);
        rintangan rintangan24 = new rintangan();
        addObject(rintangan24,588,243);
        rintangan rintangan25 = new rintangan();
        addObject(rintangan25,638,397);
        rintangan rintangan26 = new rintangan();
        addObject(rintangan26,638,351);
        rintangan rintangan27 = new rintangan();
        addObject(rintangan27,639,304);
        rintangan rintangan28 = new rintangan();
        addObject(rintangan28,639,274);
        rintangan rintangan29 = new rintangan();
        addObject(rintangan29,638,242);
        musuh musuh = new musuh();
        addObject(musuh,423,295);
        musuh musuh2 = new musuh();
        addObject(musuh2,126,191);
        musuh musuh3 = new musuh();
        addObject(musuh3,248,189);
        musuh musuh4 = new musuh();
        addObject(musuh4,544,195);
        rintangan rintangan30 = new rintangan();
        addObject(rintangan30,3,125);
        rintangan rintangan31 = new rintangan();
        addObject(rintangan31,49,126);
        rintangan rintangan32 = new rintangan();
        addObject(rintangan32,153,126);
        rintangan rintangan33 = new rintangan();
        addObject(rintangan33,201,126);
        rintangan rintangan34 = new rintangan();
        addObject(rintangan34,249,125);
        rintangan rintangan35 = new rintangan();
        addObject(rintangan35,397,130);
        rintangan rintangan36 = new rintangan();
        addObject(rintangan36,298,127);
        rintangan rintangan37 = new rintangan();
        addObject(rintangan37,347,128);
        apel apel = new apel();
        addObject(apel,485,384);
        apel apel2 = new apel();
        addObject(apel2,378,383);
        rintangan rintangan38 = new rintangan();
        addObject(rintangan38,50,85);
        rintangan rintangan39 = new rintangan();
        addObject(rintangan39,50,46);
        apel apel3 = new apel();
        addObject(apel3,3,78);
        rintangan rintangan40 = new rintangan();
        addObject(rintangan40,204,363);
        rintangan rintangan41 = new rintangan();
        addObject(rintangan41,150,34);
        rintangan rintangan42 = new rintangan();
        addObject(rintangan42,199,32);
        rintangan rintangan43 = new rintangan();
        addObject(rintangan43,246,32);
        rintangan rintangan44 = new rintangan();
        addObject(rintangan44,345,33);
        rintangan rintangan45 = new rintangan();
        addObject(rintangan45,394,35);
        rintangan rintangan46 = new rintangan();
        addObject(rintangan46,149,0);
        rintangan rintangan47 = new rintangan();
        addObject(rintangan47,198,2);
        rintangan rintangan48 = new rintangan();
        addObject(rintangan48,245,0);
        rintangan rintangan49 = new rintangan();
        addObject(rintangan49,391,0);
        rintangan rintangan50 = new rintangan();
        addObject(rintangan50,343,0);
        apel apel4 = new apel();
        addObject(apel4,294,0);
        musuh musuh5 = new musuh();
        addObject(musuh5,285,81);
        rintangan rintangan51 = new rintangan();
        addObject(rintangan51,445,129);
        rintangan rintangan52 = new rintangan();
        addObject(rintangan52,492,36);
        rintangan rintangan53 = new rintangan();
        addObject(rintangan53,491,2);
        rintangan rintangan54 = new rintangan();
        addObject(rintangan54,494,131);
        rintangan rintangan55 = new rintangan();
        addObject(rintangan55,610,130);
        rintangan rintangan56 = new rintangan();
        addObject(rintangan56,658,129);
        rintangan rintangan57 = new rintangan();
        addObject(rintangan57,537,33);
        rintangan rintangan58 = new rintangan();
        addObject(rintangan58,536,3);
        rintangan rintangan59 = new rintangan();
        addObject(rintangan59,585,39);
        rintangan rintangan60 = new rintangan();
        addObject(rintangan60,583,1);
        rintangan rintangan61 = new rintangan();
        addObject(rintangan61,627,41);
        rintangan rintangan62 = new rintangan();
        addObject(rintangan62,628,3);
        rintangan rintangan63 = new rintangan();
        addObject(rintangan63,657,82);
        apel apel5 = new apel();
        addObject(apel5,613,84);
        apel apel6 = new apel();
        addObject(apel6,441,3);
        rintangan rintangan64 = new rintangan();
        addObject(rintangan64,704,81);
        rintangan rintangan65 = new rintangan();
        addObject(rintangan65,732,83);
        rintangan rintangan66 = new rintangan();
        addObject(rintangan66,687,398);
        rintangan rintangan67 = new rintangan();
        addObject(rintangan67,737,394);
        rintangan rintangan68 = new rintangan();
        addObject(rintangan68,787,392);
        rintangan rintangan69 = new rintangan();
        addObject(rintangan69,732,311);
        rintangan rintangan70 = new rintangan();
        addObject(rintangan70,731,269);
        rintangan rintangan71 = new rintangan();
        addObject(rintangan71,728,238);
        rintangan rintangan72 = new rintangan();
        addObject(rintangan72,773,235);
        rintangan rintangan73 = new rintangan();
        addObject(rintangan73,696,126);
        rintangan rintangan74 = new rintangan();
        addObject(rintangan74,733,127);
        apel apel7 = new apel();
        addObject(apel7,775,283);
        pusaran3 pusaran3 = new pusaran3();
        addObject(pusaran3,683,22);
        musuh musuh6 = new musuh();
        addObject(musuh6,412,82);
        removeObject(pusaran3);
        kurkur.setLocation(34,-7);
        rintangan39.setLocation(39,36);
        rintangan39.setLocation(93,266);
        apel3.setLocation(79,385);
        rintangan39.setLocation(0,80);
        kurkur.setLocation(30,32);
        apel3.setLocation(35,382);
        rintangan21.setLocation(692,229);
        rintangan72.setLocation(694,280);
        rintangan rintangan75 = new rintangan();
        addObject(rintangan75,686,311);
        apel7.setLocation(690,357);
        rintangan rintangan76 = new rintangan();
        addObject(rintangan76,457,242);
        rintangan21.setLocation(685,239);
        rintangan70.setLocation(701,270);
        rintangan70.setLocation(756,267);
    }
}
