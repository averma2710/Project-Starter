package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MyModelTest {

    private Piano piano;
    PlayLearn playLearn;
    Progress Records;
    Recorder record;
    Recorder record1;
    ArrayList<String> list = new ArrayList<>();

    @BeforeEach
    public void setup() {
        piano = new Piano();
        playLearn = new PlayLearn(0, "");
        Records = new Progress();
        record = new Recorder(list);
    }

    @Test
    public void testFur() {
        assertEquals("asdfghjkl", Learn.fur());
    }

    @Test
    public void testMoos() {
        assertEquals("lkjhgfdsa", Learn.moos());
    }

    @Test
    public void testAvr() {
        assertEquals("ashdkgsjf", Learn.avr());
    }

    @Test
    public void testSans() {
        assertEquals("ldlslsgjd", Learn.sans());
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
        assertEquals(1, playLearn.setScore());

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
        playLearn.setPattern("a");
        playLearn.niceOrWrong("a",0);
        assertEquals(1, playLearn.getScore());

    }
    // @Test
    // public void getRecordsTest() {
    //     record.addRecorder("a");
    //     record.addRecorder("s");
    //    record.addRecorder("d");
    //    record.addRecorder("f");
    //    record.addRecorder("g");
    //    record.addRecorder("h");
    //    record.addRecorder("j");
    //    record.addRecorder("k");
    //    record.addRecorder("l");
    //   Records.addRecording(record);
    //   record1.addRecorder("l");
    //   record1.addRecorder("s");
    //   record1.addRecorder("d");
    //   record1.addRecorder("f");
    //   record1.addRecorder("g");
    //   record1.addRecorder("h");
    //   record1.addRecorder("j");
    //   record1.addRecorder("k");
    //   record1.addRecorder("l");
    //   Records.addRecording(record1);
    //   assertEquals(record1.getMusic().size(),Records.record1(1).getMusic().size());
    // }


}