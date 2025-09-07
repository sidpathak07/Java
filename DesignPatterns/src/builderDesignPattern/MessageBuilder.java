package builderDesignPattern;


public class MessageBuilder {
	private MessageType messageType;
    private String content;
    private String sender;
    private String recipient;
    private boolean isDelivered;
    private long timestamp;
    
    private MessageBuilder(Builder b) {
    	this.messageType = b.getMessageType();
    	this.content = b.getContent();
    	this.sender = b.getSender();
    	this.recipient = b.getRecipient();
    	this.isDelivered = b.isDelivered();
    	this.timestamp = b.getTimestamp();
    }
    
    public static Builder getBuilder() {
    	return new Builder();
    }
	public MessageType getMessageType() {
		return messageType;
	}
	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public boolean isDelivered() {
		return isDelivered;
	}
	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public static class Builder{
		private MessageType messageType;
	    private String content;
	    private String sender;
	    private String recipient;
	    private boolean isDelivered;
	    private long timestamp;
	    
	    
		public MessageType getMessageType() {
			return messageType;
		}
		public Builder setMessageType(MessageType messageType) {
			this.messageType = messageType;
			return this;
		}
		public String getContent() {
			return content;
		}
		public Builder setContent(String content) {
			this.content = content;
			return this;
		}
		public String getSender() {
			return sender;
		}
		public Builder setSender(String sender) {
			this.sender = sender;
			return this;
		}
		public String getRecipient() {
			return recipient;
		}
		public Builder setRecipient(String recipient) {
			this.recipient = recipient;
			return this;
		}
		public boolean isDelivered() {
			return isDelivered;
		}
		public Builder setDelivered(boolean isDelivered) {
			this.isDelivered = isDelivered;
			return this;
		}
		public long getTimestamp() {
			return timestamp;
		}
		public Builder setTimestamp(long timestamp) {
			this.timestamp = timestamp;
			return this;
		}
		public MessageBuilder build() {
			return new MessageBuilder(this);
		}
	}
    

}
