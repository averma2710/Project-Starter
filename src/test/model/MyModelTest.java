package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import persisitence.JsonReader;
import persisitence.WriterJson;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
//REFERENCE : code below was referred from the following project :
// https://github.students.cs.ubc.ca/CPSC210/JsonSerializationDemo.git

import static org.junit.jupiter.api.Assertions.*;

class MyModelTest {

    private Piano piano;
    PlayLearn playLearn;
    Progress Records;
    Recorder record;
    Recorder record1;
    Recorder record2;
    Recorder record3;
    Recorder record4;
    Recorder record5;
    Recorder record6;
    Recorder record7;
    Recorder record8;
    Recorder record9;
    Recorder record10;
    Recorder record11;
    Recorder record12;
    Recorder record13;
    Recorder record14;
    Recorder record15;
    Recorder record16;

    ArrayList<String> list = new ArrayList<>();
    Learn learn;
    int i = 0;

    @BeforeEach
    public void setup() {
        piano = new Piano();
        playLearn = new PlayLearn(0, "");
        Records = new Progress();
        record = new Recorder(list);
        record1 = new Recorder(list);
        learn = new Learn();
        record2 = new Recorder(list);
        record3 = new Recorder(list);
        record4 = new Recorder(list);
        record5 = new Recorder(list);
        record6 = new Recorder(list);
        record7 = new Recorder(list);
        record8 = new Recorder(list);
        record9 = new Recorder(list);
        record10 = new Recorder(list);
        record11 = new Recorder(list);
        record12 = new Recorder(list);
        record13 = new Recorder(list);
        record14 = new Recorder(list);
        record15 = new Recorder(list);
        record16 = new Recorder(list);
    }

    @Test
    public void testFur() {
        assertEquals("asdfghjkl", learn.fur());
    }

    @Test
    public void testMoos() {
        assertEquals("lkjhgfdsa", learn.moos());
    }

    @Test
    public void testAvr() {
        assertEquals("ashdkgsjf", learn.avr());
    }

    @Test
    public void testSans() {
        assertEquals("ldlslsgjd", learn.def());
    }

    @Test
    public void testMusicKeyA() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File expectedFile = new File("src/main/key01.wav");
        assertEquals(expectedFile, piano.music("a"));
    }
    @Test
    public void testMusicKeyS() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File expectedFile = new File("src/main/key02.wav");
        assertEquals(expectedFile, piano.music("s"));
    }
    @Test
    public void testMusicKeyF() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File expectedFile = new File("src/main/key04.wav");
        assertEquals(expectedFile, piano.music("f"));
    }
    @Test
    public void testMusicKeyG() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File expectedFile = new File("src/main/key05.wav");
        assertEquals(expectedFile, piano.music("g"));
    }
    @Test
    public void testMusicKeyH() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File expectedFile = new File("src/main/key06.wav");
        assertEquals(expectedFile, piano.music("h"));
    }
    @Test
    public void testMusicKeyJ() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File expectedFile = new File("src/main/key07.wav");
        assertEquals(expectedFile, piano.music("j"));
    }
    @Test
    public void testMusicKeyK() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File expectedFile = new File("src/main/key08.wav");
        assertEquals(expectedFile, piano.music("k"));
    }
    @Test
    public void testMusicKeyL() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File expectedFile = new File("src/main/key09.wav");
        assertEquals(expectedFile, piano.music("l"));
    }

    @Test
    public void testMusicKeyDefault() throws LineUnavailableException, IOException, UnsupportedAudioFileException {
        File expectedFile = new File("src/main/key09.wav");
        assertEquals(expectedFile, piano.music("b"));
    }

    @Test
    public void testMusicKeyD() throws LineUnavailableException, UnsupportedAudioFileException, IOException {
        File expectedFile = new File("src/main/key03.wav");
        assertEquals(expectedFile, piano.music("d"));
    }

    @Test
    public void PlayLearnTest() {
        playLearn = new PlayLearn(0, "asdfghjkl");
        assertEquals(0, playLearn.getScore());

    }
    @Test
    public void PlayLearnPatternTest() {
        playLearn = new PlayLearn(0, "asdfghjkl");
        assertEquals("asdfghjkl", playLearn.getPattern());

    }
    @Test
    public void GameScoreAdderTest() {
        playLearn = new PlayLearn(0, "asdfghjkl");
        assertEquals(1, playLearn.addScore());

    }
    @Test
    public void GamePatternSetterTest() {
        playLearn = new PlayLearn(0, "asdfghjkl");
        assertEquals("lkjhgfdsa", playLearn.setPattern("lkjhgfdsa"));

    }
    @Test
    public void NiceScoreReviewTest() {
        playLearn = new PlayLearn(10, "asdfghjkl");
        assertEquals("Nice score", playLearn.scorer());

    }
    @Test
    public void FailScoreReviewTest() {
        playLearn = new PlayLearn(2, "asdfghjkl");
        assertEquals("\n YOU NEED MORE PRACTICE!! \n play again \n", playLearn.scorer());
    }
    @Test
    public void PresetPatternTest() {
        assertEquals("lkjhgfdsa", playLearn.checks("MOOSE"));
        assertEquals("asdfghjkl", playLearn.checks("FUR"));
        assertEquals("ashdkgsjf", playLearn.checks("AVR"));
        assertEquals("ldlslsgjd", playLearn.checks("DEFAULT"));
    }
    @Test
    public void AddStringRecorderTest() {
        record.addRecorder("a");
        record.addRecorder("s");
        record.addRecorder("d");
        record.addRecorder("f");
        record.addRecorder("g");
        record.addRecorder("h");
        record.addRecorder("j");
        record.addRecorder("k");
        record.addRecorder("l");
        ArrayList<String> listChecker = new ArrayList<>();
        listChecker.add("a");
        listChecker.add("s");
        listChecker.add("d");
        listChecker.add("f");
        listChecker.add("g");
        listChecker.add("h");
        listChecker.add("j");
        listChecker.add("k");
        listChecker.add("l");
        assertEquals(listChecker, record.getMusic());
    }
    @Test
    public void AddRecordsTest() {
        record.addRecorder("a");
        record.addRecorder("s");
        record.addRecorder("d");
        record.addRecorder("f");
        record.addRecorder("g");
        record.addRecorder("h");
        record.addRecorder("j");
        record.addRecorder("k");
        record.addRecorder("l");
        Records.addRecording(record);
        assertEquals(1, Records.getRecordings().size());
    }

    @Test
    public void NiceOrWrongTest() {
        playLearn.setPattern("asdf");
        assertEquals(0, playLearn.getScore());
        assertEquals("nice!", playLearn.niceOrWrong("a",0));
        assertEquals(1, playLearn.getScore());
        assertEquals("wrong!", playLearn.niceOrWrong("b",1));
        assertEquals(1, playLearn.getScore());
        assertEquals("nice!", playLearn.niceOrWrong("d",2));
        assertEquals(2, playLearn.getScore());
        assertEquals("wrong!", playLearn.niceOrWrong("g",3));
        assertEquals(2, playLearn.getScore());
    }
     @Test
     public void getRecordsTest() {
        record.addRecorder("a");
        record.addRecorder("s");
        record.addRecorder("d");
        record.addRecorder("f");
        record.addRecorder("g");
        record.addRecorder("h");
        record.addRecorder("j");
        record.addRecorder("k");
        record.addRecorder("l");
        Records.addRecording(record);
        record1.addRecorder("l");
        record1.addRecorder("s");
        record1.addRecorder("d");
        record1.addRecorder("f");
        record1.addRecorder("g");
        record1.addRecorder("h");
        record1.addRecorder("j");
        record1.addRecorder("k");
        record1.addRecorder("l");
        Records.addRecording(record1);
        assertEquals(record1.getMusic().size(),Records.getRecorder(1).getMusic().size());
     }

    @Test
    public void recordedMusicTest() {
        record.addRecorder("a");
        record.addRecorder("s");
        record.addRecorder("d");
        record.addRecorder("f");
        record.addRecorder("g");
        record.addRecorder("h");
        record.addRecorder("j");
        record.addRecorder("k");
        record.addRecorder("l");
        Records.addRecording(record);
        record1.addRecorder("l");
        record1.addRecorder("s");
        record1.addRecorder("d");
        record1.addRecorder("f");
        record1.addRecorder("g");
        record1.addRecorder("h");
        record1.addRecorder("j");
        record1.addRecorder("k");
        record1.addRecorder("l");
        Records.addRecording(record1);
        assertEquals("s",record.recordedMusic(1));
        assertEquals("a",record.recordedMusic(0));
        assertEquals("k",record1.recordedMusic(7));
        assertEquals("l",record1.recordedMusic(8));
    }

    @Test
    public void toJsonTest() {
        ArrayList<String> hs = new ArrayList<>();
        for (i = 0 ; i< 10; i++) {
            hs.add("s");
        }
        Recorder h = new Recorder(hs);
        Progress pro = new Progress();
        pro.addRecording(h);
        assertEquals(1, pro.toJson().getJSONArray("songs").length());
        ArrayList<Recorder> recorder = pro.getRecordings();
        Recorder record = recorder.get(0);
        ArrayList<String> music =record.getMusic();
        assertEquals(10 , pro.toJson().getJSONArray("songs").getJSONArray(0).length());
        for (int j = 0; j <10 ; j++) {
            assertEquals("s", pro.toJson().getJSONArray("songs").getJSONArray(0).get(j));
        }

    }
    @Test
    void testWriterInvalidFile() {
        try {
            Progress pro = new Progress();
            WriterJson writer = new WriterJson("./data/my\0illegal:fileName.json");
            writer.open();
            fail("IOException was expected");
        } catch (IOException e) {
            // pass
        }
    }
    @Test
    void testWriterGeneralWorkroom() {
        try {
            Progress pro = new Progress();
            ArrayList<String> hs = new ArrayList<>();
            for (i = 0 ; i< 10; i++) {
                hs.add("s");
            }
            Recorder rec = new Recorder(hs);
            pro.addRecording(rec);
            WriterJson writer = new WriterJson("./data/TestWriter.json");
            writer.open();
            writer.write(pro);
            writer.close();

            JsonReader reader = new JsonReader("./data/TestWriter.json");
            Progress proRead = reader.read();
            List<Recorder> recordings = proRead.getRecordings();
            assertEquals(1, recordings.size());
            for (int j = 0; j <10 ; j++) {
                assertEquals("s", pro.toJson().getJSONArray("songs").getJSONArray(0).get(j));
            }
        } catch (IOException e) {
            fail("Exception should not have been thrown");
        }
    }

    @Test
    void testReaderNonExistentFile() {
        JsonReader reader = new JsonReader("./data/noSuchFile.json");
        try {
            Progress pr = reader.read();
            fail("IOException expected");
        } catch (IOException e) {
            // pass
        }
    }

    @Test
    void testReaderGeneralWorkRoom() {
        JsonReader reader = new JsonReader("./data/TestWriter.json");
        try {
            Progress pr = reader.read();
            List<Recorder> recordings = pr.getRecordings();
            assertEquals(1, recordings.size());
            for (int j = 0; j <10 ; j++) {
                assertEquals("s", pr.toJson().getJSONArray("songs").getJSONArray(0).get(j));
            }
        } catch (IOException e) {
            fail("Couldn't read from file");
        }
    }

    @Test
    void SetScoreTest() {
        PlayLearn pl = new PlayLearn(0, "asdfghjkl");
        pl.setScore(10);
        assertEquals(10, pl.getScore());
    }

    @Test
    void RemoveRecorder() {
        record.addRecorder("a");
        record.addRecorder("s");
        record.addRecorder("d");
        record.addRecorder("f");
        record.addRecorder("g");
        record.addRecorder("h");
        record.addRecorder("j");
        record.addRecorder("k");
        record.addRecorder("l");
        Records.addRecording(record);
        record1.addRecorder("l");
        record1.addRecorder("s");
        record1.addRecorder("d");
        record1.addRecorder("f");
        record1.addRecorder("g");
        record1.addRecorder("h");
        record1.addRecorder("j");
        record1.addRecorder("k");
        record1.addRecorder("l");
        Records.addRecording(record1);
        Records.remover(1);
        assertEquals(1, Records.getRecordings().size());
        assertEquals(record1, Records.getRecorder(0));

    }

    @Test
    void ShuffleMusic() {
        record.addRecorder("a");
        Records.addRecording(record);
        record1.addRecorder("b");
        Records.addRecording(record1);
        record2.addRecorder("c");
        Records.addRecording(record2);
        record3.addRecorder("d");
        Records.addRecording(record3);
        record4.addRecorder("e");
        Records.addRecording(record4);
        record5.addRecorder("f");
        Records.addRecording(record5);
        record6.addRecorder("g");
        Records.addRecording(record6);
        record7.addRecorder("h");
        Records.addRecording(record7);
        record11.addRecorder("i");
        Records.addRecording(record11);
        record8.addRecorder("j");
        Records.addRecording(record8);
        record9.addRecorder("k");
        Records.addRecording(record9);
        record10.addRecorder("l");
        Records.addRecording(record10);
        record12.addRecorder("m");
        Records.addRecording(record12);
        record13.addRecorder("n");
        Records.addRecording(record13);
        record14.addRecorder("o");
        Records.addRecording(record14);
        record15.addRecorder("p");
        Records.addRecording(record15);
        record16.addRecorder("q");
        Records.addRecording(record16);

        ArrayList<Recorder> testList = Records.getRecordings();
        ArrayList<Recorder> testList2 = new ArrayList<>(testList);
        Records.shuffler();
        assertNotEquals(testList,testList2);

    }


}