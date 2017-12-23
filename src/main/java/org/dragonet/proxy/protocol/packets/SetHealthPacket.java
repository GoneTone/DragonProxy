package org.dragonet.proxy.protocol.packets;

import org.dragonet.proxy.protocol.PEPacket;
import org.dragonet.proxy.protocol.ProtocolInfo;

/**
 * Created on 2017/10/22.
 */
public class SetHealthPacket extends PEPacket {

    public int health;

    public SetHealthPacket() {

    }

    public SetHealthPacket(int health) {
        this.health = health;
    }

    @Override
    public int pid() {
        return ProtocolInfo.SET_HEALTH_PACKET;
    }

    @Override
    public void encodePayload() {
        putVarInt(health);
    }

    @Override
    public void decodePayload() {
        health = getVarInt();
    }
}
