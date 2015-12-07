package com.lalongooo.datastructures.chain;

public class Link {
    private Link left, right;
	
    public Link getLeft() { 
        return this.left;
    }
        
    public Link getRight() { 
        return this.right; 
    }

    public void append(Link rightPart) {
        if (this.right != null)
            throw new IllegalStateException("Link is already connected.");

        this.right = rightPart;
        rightPart.left = this;
    }
}