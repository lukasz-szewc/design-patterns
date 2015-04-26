/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.designpatterns.behavioural.chainofresponsibility;

/**
 *
 */
public class Request {

    private final boolean emergencyRequest;
    private final long size;
    private final String content;

    public Request(boolean emergencyRequest, long size, String content) {
        this.emergencyRequest = emergencyRequest;
        this.size = size;
        this.content = content;
    }

    public boolean isEmergencyRequest() {
        return emergencyRequest;
    }

    public long getSize() {
        return size;
    }

    public String getContent() {
        return content;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.emergencyRequest ? 1 : 0);
        hash = 47 * hash + (int) (this.size ^ (this.size >>> 32));
        hash = 47 * hash + (this.content != null ? this.content.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Request other = (Request) obj;
        if (this.emergencyRequest != other.emergencyRequest) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        if ((this.content == null) ? (other.content != null) : !this.content.equals(other.content)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Request{" + "emergencyRequest=" + emergencyRequest + ", size=" + size + ", content=" + content + '}';
    }


}
