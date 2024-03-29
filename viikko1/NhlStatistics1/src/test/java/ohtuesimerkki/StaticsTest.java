package ohtuesimerkki;

import org.junit.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class StaticsTest {
    Reader readerStub = new Reader() {
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
            return players;
        }
    };
 
    Statistics stats;

    @Before
    public void setUp(){
        stats = new Statistics(readerStub);
    }

    @Test
    public void playerSearchTest() {
        assertEquals("Gretzky", stats.search("Gretzky").getName());
    }

	@Test
    public void playerSearchNullTest() {
        assertEquals(null, stats.search("Grotzky"));
    }

    @Test
	public void teamLengthTest() {		
		assertEquals(1, stats.team("PIT").size());
	}

	@Test
	public void topScorers() {
		assertEquals(3,stats.topScorers(2).size());
  	}
}
