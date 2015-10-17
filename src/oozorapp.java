import javax.sound.midi.MidiSystem;
import javax.sound.midi.Receiver;
import javax.sound.midi.ShortMessage;

public class oozorapp {
    static int[] inst={79,46,46,46,100,46,100,100};
    static int[] vol={100,100,100,100,100,100,100,100};
    static int[] key={67,36,60,37,61,61,61,61};
    static int scaletype=1;
    static int tempo=340;

    static music[] M;
    static PlayMidi player;

    public static void main(String[] args) {

        music M1 =new music();
        M1=melo1(M1);
        music M2 =new music();
        M2=melo2(M2);
        music M3 =new music();
        M3=melo3(M3);

        boolean[][][][] score=new boolean[16][16][8][128];
        for(int i=0;i<128;i=i+4){
            boolean[][][][] mm;

            mm=M1.getscore();
            for(int j=0;j<4;j++){
                for(int k=0;k<16;k++){
                    for(int l=0;l<16;l++){
                        for(int m=0;m<5;m++){
                            score[k][l][m][j+i]=mm[k][l][m][j];
                        }
                    }
                }
            }
            mm=	M2.getscore();
            i=i+4;
            for(int j=0;j<4;j++){
                for(int k=0;k<16;k++){
                    for(int l=0;l<16;l++){
                        for(int m=0;m<5;m++){
                            score[k][l][m][j+i]=mm[k][l][m][j];
                        }
                    }
                }
            }
            mm=M1.getscore();
            i=i+4;
            for(int j=0;j<4;j++){
                for(int k=0;k<16;k++){
                    for(int l=0;l<16;l++){
                        for(int m=0;m<5;m++){
                            score[k][l][m][j+i]=mm[k][l][m][j];
                        }
                    }
                }
            }
            mm=	M3.getscore();
            i=i+4;
            for(int j=0;j<4;j++){
                for(int k=0;k<16;k++){
                    for(int l=0;l<16;l++){
                        for(int m=0;m<5;m++){
                            score[k][l][m][j+i]=mm[k][l][m][j];
                        }
                    }
                }
            }

        }

        M=new music[4];
        M[0]=M1;
        M[1]=M2;
        M[2]=M1;
        M[3]=M3;

        PlayMidi p=new PlayMidi(M1);
        player=p;
        player.setbar(4*4);
        player.enableloop(true);
        player.start();
    }

    public static music melo1(music M){
        M.settempo(tempo);
        M.setscaletype(scaletype);
        M.setinst(inst);
        M.setvol(vol);
        M.setkey(key);

        boolean[][][][] score=new boolean[16][16][8][4];
        score[0][12][0][0]=true;
        score[1][12][0][0]=true;
        score[2][12][0][0]=true;
        score[3][12][0][0]=true;

        score[4][12][0][0]=true;
        score[5][12][0][0]=true;
        score[6][12][0][0]=true;
        score[7][12][0][0]=true;

        score[8][12][0][0]=true;
        score[9][12][0][0]=true;
        score[10][12][0][0]=true;
        score[11][12][0][0]=true;

        score[12][12][0][0]=true;
        score[13][12][0][0]=true;
        score[14][12][0][0]=true;
        score[15][12][0][0]=true;

        score[2][11][0][1]=true;
        score[3][11][0][1]=true;

        score[4][14][0][1]=true;
        score[5][14][0][1]=true;
        score[6][14][0][1]=true;
        score[7][14][0][1]=true;

        score[8][12][0][1]=true;
        score[9][12][0][1]=true;
        score[10][12][0][1]=true;
        score[11][12][0][1]=true;

        score[12][9][0][1]=true;
        score[13][9][0][1]=true;
        score[14][9][0][1]=true;
        score[15][9][0][1]=true;

        score[0][8][0][2]=true;
        score[1][8][0][2]=true;
        score[2][9][0][2]=true;
        score[3][7][0][2]=true;

        score[4][5][0][2]=true;
        score[5][5][0][2]=true;
        score[6][5][0][2]=true;
        score[7][5][0][2]=true;

        score[8][5][0][2]=true;
        score[9][5][0][2]=true;
        score[10][5][0][2]=true;
        score[11][5][0][2]=true;

        score[12][7][0][2]=true;
        score[13][7][0][2]=true;
        score[14][7][0][2]=true;
        score[15][7][0][2]=true;

        score[0][5][0][3]=true;
        score[1][5][0][3]=true;
        score[2][5][0][3]=true;
        score[3][5][0][3]=true;

        score[4][5][0][3]=true;
        score[5][5][0][3]=true;
        score[6][5][0][3]=true;
        score[7][5][0][3]=true;

        score[8][5][0][3]=true;
        score[9][5][0][3]=true;
        score[10][5][0][3]=true;
        score[11][5][0][3]=true;
//
        score[0][12][1][0]=true;
        score[1][14][1][0]=true;
        score[2][2][2][0]=true;
        score[3][5][2][0]=true;

        score[4][7][2][0]=true;
        score[5][9][2][0]=true;
        score[6][11][2][0]=true;
        score[7][9][2][0]=true;

        score[8][11][1][0]=true;
        score[9][13][1][0]=true;
        score[10][2][2][0]=true;
        score[11][4][2][0]=true;

        score[12][6][2][0]=true;
        score[13][9][2][0]=true;
        score[14][11][2][0]=true;
        score[15][9][2][0]=true;

        score[0][10][1][1]=true;
        score[1][12][1][1]=true;
        score[2][0][2][1]=true;
        score[3][2][2][1]=true;

        score[4][3][2][1]=true;
        score[5][5][2][1]=true;
        score[6][7][2][1]=true;
        score[7][9][2][1]=true;

        score[8][9][1][1]=true;
        score[9][11][1][1]=true;
        score[10][13][1][1]=true;
        score[11][1][2][1]=true;

        score[12][2][2][1]=true;
        score[13][4][2][1]=true;
        score[14][6][2][1]=true;
        score[15][8][2][1]=true;

        score[0][8][1][2]=true;
        score[1][10][1][2]=true;
        score[2][12][1][2]=true;
        score[3][0][2][2]=true;

        score[4][1][2][2]=true;
        score[5][3][2][2]=true;
        score[6][5][2][2]=true;
        score[7][7][2][2]=true;
//
        score[8][5][3][2]=true;//#
        score[9][10][1][2]=true;
        score[10][11][3][2]=true;//#
        score[11][1][2][2]=true;

        score[12][3][2][2]=true;
        score[13][4][5][2]=true;//#
        score[14][7][2][2]=true;
        score[15][8][2][2]=true;

        score[0][9][1][3]=true;
        score[1][11][3][3]=true;//#
        score[2][13][1][3]=true;
        score[3][1][2][3]=true;

        score[4][3][5][3]=true;//#
        score[5][4][5][3]=true;//#
        score[6][6][2][3]=true;
        score[7][8][2][3]=true;

        score[8][10][5][3]=true;//#
        score[9][11][5][3]=true;//#
        score[10][9][2][3]=true;
        score[11][10][5][3]=true;//#

        score[12][8][2][3]=true;
        score[13][9][2][3]=true;
        score[14][6][2][3]=true;
        score[15][8][2][3]=true;

        M.setscore(score);
        return M;

    }

    public static music melo2(music M){
        M.settempo(tempo);
        M.setscaletype(scaletype);
        M.setinst(inst);
        M.setvol(vol);
        M.setkey(key);

        boolean[][][][] score=new boolean[16][16][8][4];

        score[0][2][0][0]=true;
        score[1][2][0][0]=true;
        score[2][3][0][0]=true;
        score[3][3][0][0]=true;

        score[4][4][0][0]=true;
        score[5][4][0][0]=true;
        score[6][5][0][0]=true;
        score[7][5][0][0]=true;

        score[8][2][0][0]=true;
        score[9][2][0][0]=true;
        score[10][2][0][0]=true;
        score[11][2][0][0]=true;

        score[12][2][0][0]=true;
        score[13][3][0][0]=true;
        score[14][4][0][0]=true;
        score[15][5][0][0]=true;

        score[0][2][0][1]=true;
        score[1][2][0][1]=true;
        score[2][3][0][1]=true;
        score[3][3][0][1]=true;

        score[4][4][0][1]=true;
        score[5][4][0][1]=true;
        score[6][5][0][1]=true;
        score[7][5][0][1]=true;

        score[8][8][0][1]=true;
        score[9][8][0][1]=true;
        score[10][8][0][1]=true;
        score[11][8][0][1]=true;

        score[12][8][0][1]=true;
        score[13][8][0][1]=true;
        score[14][5][0][1]=true;


        score[0][5][0][2]=true;
        score[1][5][0][2]=true;
        score[2][4][0][2]=true;


        score[4][4][0][2]=true;
        score[5][4][0][2]=true;
        score[6][3][0][2]=true;
        score[7][3][0][2]=true;

        score[8][5][0][2]=true;
        score[9][5][0][2]=true;
        score[10][4][0][2]=true;

        score[12][4][0][2]=true;
        score[13][4][0][2]=true;
        score[14][3][0][2]=true;
        score[15][3][0][2]=true;

        score[0][2][0][3]=true;
        score[1][2][0][3]=true;
        score[2][2][0][3]=true;
        score[3][2][0][3]=true;

        score[4][2][0][3]=true;
        score[5][2][0][3]=true;
        score[6][2][0][3]=true;
        score[7][2][0][3]=true;

        score[8][2][0][3]=true;
        score[9][2][0][3]=true;
        score[10][2][0][3]=true;
        score[11][2][0][3]=true;
//
        score[0][5][1][0]=true;
        score[1][7][1][0]=true;
        score[2][9][1][0]=true;
        score[3][12][1][0]=true;

        score[4][14][1][0]=true;
        score[5][2][2][0]=true;
        score[6][5][2][0]=true;
        score[7][2][2][0]=true;

        score[8][4][3][0]=true;//
        score[9][7][1][0]=true;
        score[10][9][1][0]=true;
        score[11][11][3][0]=true;//

        score[12][14][1][0]=true;
        score[13][2][2][0]=true;
        score[14][4][5][0]=true;//
        score[15][2][2][0]=true;

        score[0][4][1][1]=true;
        score[1][7][1][1]=true;
        score[2][9][1][1]=true;
        score[3][11][1][1]=true;

        score[4][14][1][1]=true;
        score[5][2][2][1]=true;
        score[6][4][2][1]=true;
        score[7][2][2][1]=true;

        score[8][3][3][1]=true;//
        score[9][7][1][1]=true;
        score[10][10][3][1]=true;//
        score[11][12][1][1]=true;

        score[12][14][1][1]=true;
        score[13][2][2][1]=true;
        score[14][5][2][1]=true;
        score[15][2][2][1]=true;

        //
        score[0][3][1][2]=true;
        score[1][10][1][2]=true;
        score[2][12][1][2]=true;
        score[3][14][1][2]=true;


        score[4][2][2][2]=true;
        score[5][14][1][2]=true;
        score[6][12][1][2]=true;
        score[7][10][1][2]=true;

        score[8][3][1][2]=true;
        score[9][12][3][2]=true;//
        score[10][15][1][2]=true;
        score[11][3][2][2]=true;

        score[12][4][5][2]=true;//
        score[13][3][2][2]=true;
        score[14][15][1][2]=true;
        score[15][12][3][2]=true;

        score[0][6][1][3]=true;
        score[1][9][1][3]=true;
        score[2][10][3][3]=true;//
        score[3][12][1][3]=true;

        score[4][13][1][3]=true;
        score[5][2][2][3]=true;
        score[6][3][5][3]=true;//
        score[7][5][2][3]=true;

        score[8][2][1][3]=true;
        score[8][9][1][3]=true;
        score[9][11][3][3]=true;//
        score[10][13][1][3]=true;
        score[11][15][1][3]=true;

        score[12][3][2][3]=true;
        score[13][4][5][3]=true;//
        score[14][7][5][3]=true;//
        score[15][9][2][3]=true;


        M.setscore(score);
        return M;
    }

    public static music melo3(music M){
        M.settempo(tempo);
        M.setscaletype(scaletype);
        M.setinst(inst);
        M.setvol(vol);
        M.setkey(key);

        boolean[][][][] score=new boolean[16][16][8][4];

        score[0][2][0][0]=true;
        score[1][2][0][0]=true;
        score[2][3][0][0]=true;
        score[3][3][0][0]=true;

        score[4][4][0][0]=true;
        score[5][4][0][0]=true;
        score[6][5][0][0]=true;
        score[7][5][0][0]=true;

        score[8][2][0][0]=true;
        score[9][2][0][0]=true;
        score[10][2][0][0]=true;
        score[11][2][0][0]=true;

        score[12][2][0][0]=true;
        score[13][3][0][0]=true;
        score[14][4][0][0]=true;
        score[15][5][0][0]=true;

        score[0][2][0][1]=true;
        score[1][2][0][1]=true;
        score[2][3][0][1]=true;
        score[3][3][0][1]=true;

        score[4][4][0][1]=true;
        score[5][4][0][1]=true;
        score[6][5][0][1]=true;
        score[7][5][0][1]=true;

        score[8][8][0][1]=true;
        score[9][8][0][1]=true;
        score[10][8][0][1]=true;
        score[11][8][0][1]=true;

        score[12][8][0][1]=true;
        score[13][8][0][1]=true;
        score[14][5][0][1]=true;


        score[0][5][0][2]=true;
        score[1][5][0][2]=true;
        score[2][4][0][2]=true;


        score[4][4][0][2]=true;
        score[5][4][0][2]=true;
        score[6][3][0][2]=true;
        score[7][3][0][2]=true;

        score[8][2][0][2]=true;
        score[9][2][0][2]=true;
        score[10][1][0][2]=true;
        score[11][1][0][2]=true;

        score[12][0][0][2]=true;
        score[13][0][0][2]=true;
        score[14][0][0][2]=true;
        score[15][0][0][2]=true;

        score[0][1][0][3]=true;
        score[1][1][0][3]=true;
        score[2][1][0][3]=true;
        score[3][1][0][3]=true;

        score[4][1][0][3]=true;
        score[5][1][0][3]=true;
        score[6][1][0][3]=true;
        score[7][1][0][3]=true;

        score[8][1][0][3]=true;
        score[9][1][0][3]=true;
        score[10][1][0][3]=true;
        score[11][1][0][3]=true;
//
        score[0][5][1][0]=true;
        score[1][7][1][0]=true;
        score[2][9][1][0]=true;
        score[3][12][1][0]=true;

        score[4][14][1][0]=true;
        score[5][2][2][0]=true;
        score[6][5][2][0]=true;
        score[7][2][2][0]=true;

        score[8][4][3][0]=true;//
        score[9][7][1][0]=true;
        score[10][9][1][0]=true;
        score[11][11][3][0]=true;//

        score[12][14][1][0]=true;
        score[13][2][2][0]=true;
        score[14][4][5][0]=true;//
        score[15][2][2][0]=true;

        score[0][4][1][1]=true;
        score[1][7][1][1]=true;
        score[2][9][1][1]=true;
        score[3][11][1][1]=true;

        score[4][14][1][1]=true;
        score[5][2][2][1]=true;
        score[6][4][2][1]=true;
        score[7][2][2][1]=true;

        score[8][3][3][1]=true;//
        score[9][7][1][1]=true;
        score[10][10][3][1]=true;//
        score[11][12][1][1]=true;

        score[12][14][1][1]=true;
        score[13][2][2][1]=true;
        score[14][5][2][1]=true;
        score[15][2][2][1]=true;


        score[0][3][1][2]=true;
        score[1][7][1][2]=true;
        score[2][10][1][2]=true;
        score[3][12][1][2]=true;


        score[4][14][1][2]=true;
        score[5][12][1][2]=true;
        score[6][10][1][2]=true;
        score[7][7][1][2]=true;

        score[8][9][1][2]=true;
        score[9][13][1][2]=true;
        score[10][2][2][2]=true;
        score[11][13][1][2]=true;

        score[12][4][2][2]=true;
        score[13][2][2][2]=true;
        score[14][13][1][2]=true;
        score[15][9][1][2]=true;

        score[0][5][1][3]=true;
        score[1][6][1][3]=true;
        score[2][7][3][3]=true;//
        score[3][9][1][3]=true;

        score[4][12][1][3]=true;
        score[5][13][1][3]=true;
        score[6][14][3][3]=true;//
        score[7][2][2][3]=true;

        score[8][5][2][3]=true;
        score[9][6][2][3]=true;
        score[10][7][5][3]=true;//
        score[11][9][2][3]=true;

        score[12][12][2][3]=true;
        score[13][2][2][3]=true;
        score[14][14][3][3]=true;//
        score[15][13][1][3]=true;


        M.setscore(score);
        return M;
    }

    public static class PlayMidi extends Thread{

        ////////////////////////////////////////////////////////////////////
        private void setscale(int scalenum) {//���� ���ƃX�P�[���̎�ނ�ǉ�
            int subscale[]={0,2,4,5,7,9,11,12,14,16,17,19,21,23,24,26};
            if(scalenum==2){
                int okinawa[]={0,4,5,7,11,12,16,17,19,23,24,28,29,31,35,36};
                for(int i=0;i<16;i++){
                    subscale[i]=okinawa[i];
                }
            }else if(scalenum==3){
                int minor[]={0,2,3,5,7,8,11,12,14,15,17,19,20,23,24,26};
                for(int i=0;i<16;i++){
                    subscale[i]=minor[i];
                }
            }else if(scalenum==4){
                int jipusi[]={0,1,4,5,7,8,11,12,13,16,17,19,20,23,24,25};
                for(int i=0;i<16;i++){
                    subscale[i]=jipusi[i];
                }
            }else if(scalenum==5){
                int spanish[]={0,1,3,4,5,7,8,10,/**/12,13,15,16,17,19,20,22};
                for(int i=0;i<16;i++){
                    subscale[i]=spanish[i];
                }
            }else if(scalenum==6){
                int yonnnananuki[]={0,2,4,7,9,/**/12,14,16,19,21,/**/24,26,28,31,33,/**/36};
                for(int i=0;i<16;i++){
                    subscale[i]=yonnnananuki[i];
                }
            }

            for(int i=0;i<8;i++){
                for(int j=0;j<16;j++){
                    scale[j][i]=subscale[j];
                }
            }

        }
        ////////////////////////////////////////////////////////////////////

        private int scale[][];
        private boolean[][] playingscale;
        private int bar=1;
        private boolean loop=false;
        Receiver receiver;
        ShortMessage message;

        public PlayMidi(music m){
            scale=new int[16][16];
            playingscale=new boolean[16][16];
        }

        public void run(){
            try{
                receiver = MidiSystem.getReceiver();
                message = new ShortMessage();

                do{
                    for(int currentbar=0;currentbar<bar;currentbar++){//�Đ�
                        int n=currentbar/4;


                        for(int i=0;i<8;i++){//���F�f�[�^�̑��M
                            message.setMessage(ShortMessage.PROGRAM_CHANGE|i, M[n].inst[i], 0);//���F�ύX
                            receiver.send(message, -1);
                        }

                        setscale(M[n].scaletype);
                        for(int j=0;j<8;j++){
                            for(int i=0;i<16;i++){
                                scale[i][j]=scale[i][j]+M[n].key[j];
                            }
                        }
                        //Purcussion�p
                        int Dscale[]={35,36,38,37,39,42,44,46,41,45,47,50,49,51,62,81};
                        for(int j=0;j<16;j++){scale[j][4]=Dscale[j];}


                        for(int i=0;i<16;i++){
                            for(int j=0;j<16;j++){
                                for(int k=0;k<8;k++){
                                    if(k==4){
                                        if(M[n].score[i][j][k][currentbar-4*n]==true){
                                            message.setMessage(ShortMessage.NOTE_OFF|9, scale[j][k]/*���K*/, 127/*����*/);
                                            message.setMessage(ShortMessage.NOTE_ON|9, scale[j][k]/*���K*/, (int)(M[n].vol[k]*1.27)/*����*/);//���M�������f�[�^���Z�b�g
                                            receiver.send(message, -1/*�����͋@�\���܂���*/);//���M
                                        }
                                    }else if(M[n].score[i][j][k][currentbar-4*n]==true){
                                        if(playingscale[j][k]==false){
                                            message.setMessage(ShortMessage.NOTE_ON|k, scale[j][k]/*���K*/,(int)(M[n].vol[k]*1.27)/*����*/);//���M�������f�[�^���Z�b�g
                                            receiver.send(message, -1/*�����͋@�\���܂���*/);//���M
                                            playingscale[j][k]=true;
                                        }
                                    }else{
                                        message.setMessage(ShortMessage.NOTE_OFF|k, scale[j][k]/*���K*/, 127/*����*/);//���M�������f�[�^���Z�b�g
                                        receiver.send(message, -1/*�����͋@�\���܂���*/);//���M
                                        playingscale[j][k]=false;
                                    }
                                }
                            }

                            Thread.sleep(60000/M[n].tempo);
                        }
                        if(currentbar%4==3){
                            for(int i=0;i<8;i++){//�S���̏�������
                                for(int j=0;j<16;j++){
                                    message.setMessage(ShortMessage.NOTE_OFF|i, scale[j][i]/*���K*/, 127/*����*/);//���M�������f�[�^���Z�b�g
                                    receiver.send(message, -1/*�����͋@�\���܂���*/);//���M
                                    playingscale[j][i]=false;
                                }
                            }
                        }
                    }
                }while(loop==true);

                mute();


            }catch(Exception e){
                e.printStackTrace();
            }
        }

        public void mute(){
            try{
                receiver.close();
                for(int i=0;i<8;i++){//�S���̏�������
                    for(int j=0;j<16;j++){
                        message.setMessage(ShortMessage.NOTE_OFF|i, scale[j][i]/*���K*/, 127/*����*/);//���M�������f�[�^���Z�b�g
                        receiver.send(message, -1/*�����͋@�\���܂���*/);//���M
                        playingscale[j][i]=false;
                    }
                }
            }catch(Exception e){}

            this.interrupt();
        }

        public void enableloop(boolean B){
            loop=B;
        }

        public void setbar(int b){
            bar=b;
        }

    }


}
