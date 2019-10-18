package buildModel;

import java.math.BigDecimal;
import java.util.Date;

public class RedPacketBuilderImpl implements RedPacketBuilder {
	
	private String publisherName;

    private String acceptName;

    private BigDecimal packetAmount;
    
    private int packetType;

    private Date pulishPacketTime;

    private Date openPacketTime;

    public static RedPacketBuilderImpl getBulider(){
        return new RedPacketBuilderImpl();
    }


    public RedPacketBuilder setPublisherName(String publishName) {
        this.publisherName = publishName;
        return this;
    }

    public RedPacketBuilder setAcceptName(String acceptName) {
       this.acceptName = acceptName;
       return this;
    }

    public RedPacketBuilder setPacketAmount(BigDecimal packetAmount) {
       this.packetAmount = packetAmount;
       return this;
    }

    public RedPacketBuilder setPacketType(int packetType) {
        this.packetType = packetType;
        return this;
    }

    public RedPacketBuilder setPulishPacketTime(Date pushlishPacketTime) {
       this.pulishPacketTime = pushlishPacketTime;
        return this;
    }

    
    public RedPacketBuilder setOpenPacketTime(Date openPacketTime) {
      this.openPacketTime = openPacketTime;
        return this;
    }


    public RedPacket build() {
        return new RedPacket(publisherName,acceptName,packetAmount,packetType,pulishPacketTime,openPacketTime);
    }
}
