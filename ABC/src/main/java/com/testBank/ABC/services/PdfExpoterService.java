package com.testBank.ABC.services;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.testBank.ABC.models.Transaction;
import com.testBank.ABC.models.User;

@Service
public class PdfExpoterService {
	
	private TransactionService transactionService;
	private List<Transaction> transactionList;
	
	public PdfExpoterService (TransactionService transactionService,List<Transaction>transactionList) {
	    super();
	    this.transactionService=transactionService;
	    this.transactionList=transactionList;
	    
	}
	
	public void createPdf(HttpServletResponse response) throws DocumentException, IOException{
		Document document = new Document();
		PdfWriter.getInstance(document, response.getOutputStream());
		document.open();
		PdfPTable table = new PdfPTable(6);
		table.setWidthPercentage(90);
		PdfPCell cell =new PdfPCell();
		cell.setPhrase(new Phrase("Transaction ID"));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Account Number"));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Amount"));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Date & Time"));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Type"));
        table.addCell(cell);
        cell.setPhrase(new Phrase("Destination ID"));
        table.addCell(cell);
        
        
        
        transactionList = transactionService.getAllTransaction();
        
        for(Transaction transaction : transactionList) {
        
        	table.addCell(Integer.toString(transaction.getTransactionID()));
        	table.addCell(Integer.toString(transaction.getAccountNumber()));
        	table.addCell(Float.toString(transaction.getAmount()));
        	table.addCell(transaction.getDate_time().toString());
        	table.addCell(transaction.getType());
        	table.addCell(Integer.toString(transaction.getdestinationAccID()));
        	
        }
		document.add(table);
		   document.close();
		
	}
	
	
	

}
