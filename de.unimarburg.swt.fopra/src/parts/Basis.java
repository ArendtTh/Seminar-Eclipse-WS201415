package parts;

 


import java.util.Date;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.bindings.keys.KeyStroke;
import org.eclipse.jface.bindings.keys.ParseException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.fieldassist.ContentProposalAdapter;
import org.eclipse.jface.fieldassist.SimpleContentProposalProvider;
import org.eclipse.jface.fieldassist.TextContentAdapter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;

import fopramodel.FoPra;
import fopramodel.Status;
import fopramodel.Student;
import fopramodel.impl.FoPraImpl;


public class Basis {
	private Text TextTitel;
	private Text BeschreibungText;
	private Text TextBearbeiter;
	private Button ButtonSaveNew;
	private CCombo StatusCombo;
	private Label Zeitraum;
	private DateTime DateStart;
	private DateTime DateEnd;
	private String Zeitraumvar1="";
	private String Zeitraumvar2="";
	
	
	
	
	
	
	@Inject
	public Basis() {
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		parent.setLayout(new FillLayout(SWT.VERTICAL));
		
		Composite CompOben = new Composite(parent, SWT.NONE);
		CompOben.setLayout(new GridLayout(2, false));
		
		Label LabelLaueft = new Label(CompOben, SWT.NONE);
		LabelLaueft.setText("L�uft vom");
		
		Zeitraum = new Label(CompOben, SWT.NONE);
		Zeitraum.setToolTipText("Gibt den Zeitraum des Praktikums an");
		Zeitraum.setAlignment(SWT.LEFT);
		Zeitraum.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		
		
		Label LabelTitel = new Label(CompOben, SWT.NONE);
		LabelTitel.setText("Titel");
		
		TextTitel = new Text(CompOben, SWT.BORDER);
		TextTitel.setToolTipText("Titel des Praktikums");
		TextTitel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		KeyStroke keyStroke;
		try {
			  keyStroke = KeyStroke.getInstance("Ctrl+Space");
			  ContentProposalAdapter adapter = new ContentProposalAdapter(TextTitel,
			    new TextContentAdapter(),
			    new SimpleContentProposalProvider(new String[] {
			      "EMF Refactor", "Eclipse 4", "SWT Designer" }),
			      keyStroke, null);
			    } catch (ParseException e1) {
			  e1.printStackTrace();
			} 
		
		
		
		
		
		Label LabelBeschreibung = new Label(CompOben, SWT.NONE);
		LabelBeschreibung.setText("Beschreibung");
		new Label(CompOben, SWT.NONE);
		
		BeschreibungText = new Text(CompOben, SWT.MULTI | SWT.BORDER | SWT.WRAP | SWT.V_SCROLL);
		BeschreibungText.setToolTipText("Beschreibung des Praktikums");
		BeschreibungText.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 1));
		try {
			  keyStroke = KeyStroke.getInstance("Ctrl+Space");
			  ContentProposalAdapter adapter = new ContentProposalAdapter(BeschreibungText,
			    new TextContentAdapter(),
			    new SimpleContentProposalProvider(new String[] {
			      "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, "
			      + "sed diam nonumy eirmod tempor invidunt ut labore et dolore "
			      + "magna aliquyam erat, sed diam voluptua. At vero eos et accusam "
			      + "et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata " }),
			      keyStroke, null);
			    } catch (ParseException e1) {
			  e1.printStackTrace();
			} 
		
		
		Composite CompUnten = new Composite(parent, SWT.NONE);
		GridLayout gl_CompUnten = new GridLayout(2, false);
		gl_CompUnten.horizontalSpacing = 25;
		CompUnten.setLayout(gl_CompUnten);
		
		Label LabelStatus = new Label(CompUnten, SWT.NONE);
		LabelStatus.setText("Status");
		
		StatusCombo = new CCombo(CompUnten, SWT.BORDER);
		StatusCombo.setVisibleItemCount(4);
		StatusCombo.setToolTipText("Information �ber den Status des Projektes");
		StatusCombo.setEditable(false);
		StatusCombo.setText("- bitte auswählen -");
		StatusCombo.setItems(new String[] {"offen", "abgeschlossen", "in Bearbeitung", "abgebrochen"});
		StatusCombo.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		
		Label LabelMax = new Label(CompUnten, SWT.NONE);
		LabelMax.setText("Max. Bearbeiter");
		
		TextBearbeiter = new Text(CompUnten, SWT.BORDER);
		TextBearbeiter.setToolTipText("Maximale Anzahl an bearbeitenden Studenten");
		TextBearbeiter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		TextBearbeiter.setOrientation(SWT.RIGHT_TO_LEFT);
		TextBearbeiter.addVerifyListener(new VerifyListener() {
				@Override
				public void verifyText(VerifyEvent arg0) {
				String check = arg0.text;
				boolean isFloat = true;
	            try
	            {
	                Float.parseFloat(check);
	            }
	            catch(NumberFormatException ex)
	            {
	                isFloat = false;
	            }
	            if(!isFloat)
	                arg0.doit = false;
	        }
			
		});
		try {
			  keyStroke = KeyStroke.getInstance("Ctrl+Space");
			  ContentProposalAdapter adapter = new ContentProposalAdapter(TextBearbeiter,
			    new TextContentAdapter(),
			    new SimpleContentProposalProvider(new String[] {
			      "0","1","2","3","4","5","6","7","8","9" }),
			      keyStroke, null);
			    } catch (ParseException e1) {
			  e1.printStackTrace();
		} 
		
		
		Label LabelStart = new Label(CompUnten, SWT.NONE);
		LabelStart.setText("Startdatum");
		
		DateStart = new DateTime(CompUnten, SWT.BORDER);
		DateStart.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Zeitraumvar1 = ""+DateStart.getDay()+" . "+(DateStart.getMonth()+1)+" . "+DateStart.getYear();
				Zeitraum.setText(Zeitraumvar1 + " bis zum " + Zeitraumvar2);
			}
		});
		DateStart.setToolTipText("Startdatum des Praktikums");
		DateStart.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		
		
		Label LabelEnd = new Label(CompUnten, SWT.NONE);
		LabelEnd.setText("Enddatum");
		DateEnd = new DateTime(CompUnten, SWT.BORDER);
		DateEnd.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Zeitraumvar2 = ""+DateEnd.getDay()+" . "+(DateEnd.getMonth()+1)+" . "+DateEnd.getYear();
				Zeitraum.setText( Zeitraumvar1 + " bis zum " + Zeitraumvar2);
			}
		});
		DateEnd.setToolTipText("Enddatum des Praktikums");
		DateEnd.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		
		Button ButtonSave = new Button(CompUnten, SWT.NONE);
		ButtonSave.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
							
				// SAVE()
			}
		});
		ButtonSave.setToolTipText("Speichert die Daten");
		GridData gd_ButtonSave = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_ButtonSave.widthHint = 90;
		ButtonSave.setLayoutData(gd_ButtonSave);
		ButtonSave.setText("Speichern");
		
		ButtonSaveNew = new Button(CompUnten, SWT.NONE);
		ButtonSaveNew.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				TextTitel.setText("");
				TextBearbeiter.setText("0");
				BeschreibungText.setText("");
				StatusCombo.setText("");
				Zeitraum.setText("");
				Zeitraumvar1="";
				Zeitraumvar2="";
				DateStart.setDate(2001, 0, 1);
				DateEnd.setDate(2001, 0, 1);
				// SAVE()
			}
		} );
		ButtonSaveNew.setToolTipText("Speichert die Daten und entfernt anschließend Eingaben");
		GridData gd_ButtonSaveNew = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_ButtonSaveNew.widthHint = 90;
		ButtonSaveNew.setLayoutData(gd_ButtonSaveNew);
		ButtonSaveNew.setText("Speichern und Neu");
		
	}
	/*
	 * Funktion um speichern zu gewährleisten. Richtiger Konstruktor für FoPra fehlt
	 */
	void save(){
		
		FoPra SaveFo = null;
		SaveFo.setTitle(TextTitel.getText());
		SaveFo.setDescription(BeschreibungText.getText());
		SaveFo.setMaxNumberOfStudents(Integer.parseInt(TextBearbeiter.getText()));
		
		String stat = StatusCombo.getText();
		Status state = null;
		switch (stat) {
		case "offen":			state= Status.PENDING;
								break;
		case "abgeschlossen": 	state= Status.COMPLETED;
								break;
		case "in Bearbeitung":	state= Status.INPROCESS;
								break;
		case "abgebrochen":		state= Status.CANCELLED;
								break;
		default:				System.out.println("error?");
								break;
		}
		SaveFo.setStatus(state);
		Date Sdate = new Date(DateStart.getYear(), DateStart.getMonth(), DateStart.getDay());
		SaveFo.setStart(Sdate);
		Date Edate = new Date(DateEnd.getYear(), DateEnd.getMonth(), DateEnd.getDay());
		SaveFo.setEnd(Edate);
		
	}

	@Focus
	public void setFocus() {
	ButtonSaveNew.setFocus();
	}
	
	@Inject
	public void setSelection(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) FoPra selection) {
	  if (selection != null) {
		  TextTitel.setText(selection.getTitle());
		  BeschreibungText.setText(selection.getDescription());
		  TextBearbeiter.setText("" + selection.getMaxNumberOfStudents());
	  }
	} 


}