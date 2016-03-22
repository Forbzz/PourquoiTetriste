package fr.esiea.tadondin.Tetriste;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 * Hello world!
 *
 */
public class App extends Canvas implements Runnable, KeyListener 
{
	
		public static final int WIDTH= 400, HEIGHT = 565;
    public static void main( String[] args )
    {
    	JFrame fenetre= new JFrame("Tetriste?");
    	fenetre.setSize(WIDTH,HEIGHT);
    	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println( "Hello LES GARS!" );
        fenetre.setLocationRelativeTo(null);
        fenetre.setResizable(false);
        fenetre.setLayout(null);
        
        JMenuBar bar = new JMenuBar();
        bar.setBounds(0, 0, WIDTH, 25);
        
        JMenu file = new JMenu("File");
        file.setBounds(0, 0, 45, 24);
        
        JMenuItem newGame = new JMenuItem("New Game");
        newGame.addActionListener(new ActionListener(){
        	public void	actionPerformed(ActionEvent e){
        		//Code de nouvelle partie
        		System.out.println("Starting New Game");
        	}
        });
        
        final JMenuItem highScore = new JMenuItem("HighScore");
        highScore.addActionListener(new ActionListener(){
        	public void	actionPerformed(ActionEvent e){
        		int highscore = 0; //
        		final JFrame alert = new JFrame("High Score!");
        		alert.setSize(200,  150);
        		alert.setLayout(null);
        		alert.setLocationRelativeTo(null);
        		
        		JLabel score = new JLabel("The Highscore is: " + highscore);
        		score.setBounds(0, 0, 200, 50);
        		
        		JButton okayButton = new JButton("Okay");
        		okayButton.setBounds(50, 80, 100, 30);
        		okayButton.addActionListener(new ActionListener(){
        			public void actionPerformed(ActionEvent e) {
        				alert.dispose();
        			}
        		});
        		
        		alert.add(score);
        		alert.add(okayButton);
        		alert.setResizable(false);
        		alert.setVisible(true);
        	}
        });
        
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new ActionListener(){
        	public void	actionPerformed(ActionEvent e){
        		System.out.println("Closing");
        		System.exit(0);
        	}
        });
        
        App tm = new App();
        tm.setBounds(0, 25, WIDTH, HEIGHT - 25);
        
        fenetre.add(tm);
        file.add(newGame);
        file.add(highScore);
        file.add(exit);
        bar.add(file);
        fenetre.add(bar);
        fenetre.setVisible(true);
        tm.start();
    }
    
    
    public void start(){
    	
    	Thread t = new Thread(this);
    	t.setPriority(Thread.MAX_PRIORITY);
    	t.start();
    }
    public void run(){
    	boolean running = true;
    	while(running){
    		update();
    		BufferStrategy buf = getBufferStrategy();
    		if(buf == null){
    			createBufferStrategy(3);
    			continue;
    		}
    		Graphics2D g = (Graphics2D) buf.getDrawGraphics();
    		render(g);
    		buf.show();
    	}
    }
    
    public void update(){
    	
    	
    }
    
    public void render(Graphics2D g){
    	g.setColor(Color.BLACK);
    	g.fillRect(0,0,WIDTH,HEIGHT);
    	g.setColor(Color.WHITE);
    	g.setFont(new Font("Calibri",Font.PLAIN,20));
    	g.drawString("Tetris", 200, 50);
    	
    }
    
    public void keyPressed(KeyEvent e){
    	
    	
    }
    
    public void keyTyped(KeyEvent e){
    	
    	
    }
    
    
    public void keyReleased(KeyEvent e){}
    
    
}
