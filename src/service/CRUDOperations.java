package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Blog;

public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	
	public List<Blog> createBlog(Blog blog) throws IOException {
		list.add(blog);
		Collections.sort(list,(Blog blog1,Blog blog2)->(blog1.getBlogTitle().toUpperCase()).compareTo(blog2.getBlogTitle().toUpperCase()));
		displayList();
		return list;
	}
	
	private void displayList() {
		int length=list.size();
		for(int i=0;i<length;i++)
		{
			System.out.println(list.get(i).getBlogTitle()+" "+list.get(i).getBlogDescription());
		}
		
	}

	public List<Blog> viewBlog(Blog blog) throws IOException{
		return list;
		}

}
