package net.devaction.kafka.avro.util;

import java.math.BigDecimal;

import net.devaction.entity.TransferEntity;
import net.devaction.entity.util.NumUtil;
import net.devaction.kafka.avro.Transfer;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
public class TransferConverter {

    private TransferConverter() {}

    public static TransferEntity convertToPojo(Transfer transfer) {
        BigDecimal amount = NumUtil.convert(transfer.getAmountUnscaled(),
                transfer.getAmountScale());


        return new TransferEntity(transfer.getId(), transfer.getAccountId(), amount,
                transfer.getTransferTS());
    }

    public static Transfer convertToAvro(TransferEntity entity) {
        return new Transfer(entity.getId(), entity.getAccountId(),
                entity.getAmount().unscaledValue().longValueExact(),
                entity.getAmount().scale(),
                entity.getTransferTS());
    }
}
