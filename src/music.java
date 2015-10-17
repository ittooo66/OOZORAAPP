import java.util.StringTokenizer;

//20120721
public class music {//����
    int tempo=100;//BPM
    int scaletype=1;;
    int inst[]={100,100,100,100,100,100,100,100};
    int key[] = {60,60,60,60,60,60,60,60};//[�`�����l��]
    int vol[] = {100,100,100,100,100,100,100,100};//[�`�����l��]  0-100�œ����Ă�
    boolean[][][][] score;//[�^�C�~���O][���K][�`�����l��][����]
    boolean promode=true;//�ҏW���x���Atrue=pro

    public music(){
        score=new boolean[16][16][8][128];
    }

    public void  setvol(int[] vol)				{this.vol=vol;}
    public int[] getvol()						{return vol;}

    public void  setscaletype(int scaletype)	{this.scaletype=scaletype;}
    public int   getscaletype()					{return scaletype;}

    public void  settempo(int tempo)			{this.tempo=tempo;}
    public int   gettempo()						{return tempo;}

    public void  setinst(int[] inst)			{this.inst=inst;}
    public int[] getinst()						{return inst;}

    public void  setkey(int[] key)				{this.key=key;}
    public int[] getkey()						{return key;}

    public void  setscore(boolean[][][][]score)	{this.score=score;}
    public boolean[][][][] getscore()			{return score;}

}
