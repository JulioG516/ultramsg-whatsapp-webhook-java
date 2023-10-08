package dev.achilles.WhatsappWebhook;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.annotation.Nullable;

class Data{


    @JsonProperty("id")
    public String Id;

    @JsonProperty("from")
    public String From;

    @JsonProperty("to")
    public String To;

    @JsonProperty("ack")
    @Nullable
    public String Ack;

    @JsonProperty("type")
    public String Type;

    @JsonProperty("msgId")
    @Nullable
    public String msgId;

    @JsonProperty("body")
    public String Body;

    @JsonProperty("media")
    @Nullable
    public String Media;

    @JsonProperty("fromMe")
    public String FromMe;
    @JsonProperty("isForwarded")
    public String IsForwarded;
    @JsonProperty("time")
    public String Time;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getFrom() {
        return From;
    }

    public void setFrom(String from) {
        From = from;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String to) {
        To = to;
    }

    public String getAck() {
        return Ack;
    }

    public void setAck(String ack) {
        Ack = ack;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getMsgId() {
        return msgId;
    }

    public void setMsgId(String msgId) {
        this.msgId = msgId;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    public String getMedia() {
        return Media;
    }

    public void setMedia(String media) {
        Media = media;
    }

    public String getFromMe() {
        return FromMe;
    }

    public void setFromMe(String fromMe) {
        FromMe = fromMe;
    }

    public String getIsForwarded() {
        return IsForwarded;
    }

    public void setIsForwarded(String isForwarded) {
        IsForwarded = isForwarded;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    @Override
    public String toString() {
        return "Data{" +
                "Id='" + Id + '\'' +
                ", From='" + From + '\'' +
                ", To='" + To + '\'' +
                ", Ack='" + Ack + '\'' +
                ", Type='" + Type + '\'' +
                ", msgId='" + msgId + '\'' +
                ", Body='" + Body + '\'' +
                ", Media='" + Media + '\'' +
                ", FromMe='" + FromMe + '\'' +
                ", IsForwarded='" + IsForwarded + '\'' +
                ", Time='" + Time + '\'' +
                '}';
    }
}
public class HookData {
    @JsonProperty("event_type")
    public String EventType;

    @JsonProperty("instanceId")
    public String InstanceId;

    @JsonProperty("referenceId")
    @Nullable
    public String referenceId;

    @JsonProperty("data")
    @Nullable
    public Data Data;

    public String getEventType() {
        return EventType;
    }

    public void setEventType(String eventType) {
        EventType = eventType;
    }

    public String getInstanceId() {
        return InstanceId;
    }

    public void setInstanceId(String instanceId) {
        InstanceId = instanceId;
    }

    @Nullable
    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(@Nullable String referenceId) {
        this.referenceId = referenceId;
    }

    @Nullable
    public dev.achilles.WhatsappWebhook.Data getData() {
        return Data;
    }

    public void setData(@Nullable dev.achilles.WhatsappWebhook.Data data) {
        Data = data;
    }

    @Override
    public String toString() {
        return "HookData{" +
                "EventType='" + EventType + '\'' +
                ", InstanceId='" + InstanceId + '\'' +
                ", referenceId='" + referenceId + '\'' +
                ", Data=" + Data +
                '}';
    }
}
