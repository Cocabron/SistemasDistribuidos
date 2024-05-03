# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: shop.proto
# Protobuf Python Version: 4.25.1
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\nshop.proto\x12\x04shop\"7\n\x0fPurchaseRequest\x12\x12\n\nproduct_id\x18\x01 \x01(\t\x12\x10\n\x08quantity\x18\x02 \x01(\x05\"8\n\x10PurchaseResponse\x12\x0f\n\x07message\x18\x01 \x01(\t\x12\x13\n\x0btotal_price\x18\x02 \x01(\x05\"8\n\x0ePaymentRequest\x12\x16\n\x0epayment_method\x18\x01 \x01(\t\x12\x0e\n\x06\x61mount\x18\x02 \x01(\x02\"3\n\x0fPaymentResponse\x12\x0f\n\x07message\x18\x01 \x01(\t\x12\x0f\n\x07success\x18\x02 \x01(\x08\"4\n\x0cOrderRequest\x12$\n\x05items\x18\x01 \x03(\x0b\x32\x15.shop.PurchaseRequest\"L\n\rOrderResponse\x12\x10\n\x08order_id\x18\x01 \x01(\t\x12)\n\tpurchases\x18\x02 \x03(\x0b\x32\x16.shop.PurchaseResponse\"(\n\x12ProductInfoRequest\x12\x12\n\nproduct_id\x18\x01 \x01(\t\"G\n\x13ProductInfoResponse\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x13\n\x0b\x64\x65scription\x18\x02 \x01(\t\x12\r\n\x05price\x18\x03 \x01(\x02\x32\x86\x02\n\x0bShopService\x12=\n\x0cPurchaseItem\x12\x15.shop.PurchaseRequest\x1a\x16.shop.PurchaseResponse\x12:\n\x0bMakePayment\x12\x14.shop.PaymentRequest\x1a\x15.shop.PaymentResponse\x12\x35\n\nPlaceOrder\x12\x12.shop.OrderRequest\x1a\x13.shop.OrderResponse\x12\x45\n\x0eGetProductInfo\x12\x18.shop.ProductInfoRequest\x1a\x19.shop.ProductInfoResponseb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'shop_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  DESCRIPTOR._options = None
  _globals['_PURCHASEREQUEST']._serialized_start=20
  _globals['_PURCHASEREQUEST']._serialized_end=75
  _globals['_PURCHASERESPONSE']._serialized_start=77
  _globals['_PURCHASERESPONSE']._serialized_end=133
  _globals['_PAYMENTREQUEST']._serialized_start=135
  _globals['_PAYMENTREQUEST']._serialized_end=191
  _globals['_PAYMENTRESPONSE']._serialized_start=193
  _globals['_PAYMENTRESPONSE']._serialized_end=244
  _globals['_ORDERREQUEST']._serialized_start=246
  _globals['_ORDERREQUEST']._serialized_end=298
  _globals['_ORDERRESPONSE']._serialized_start=300
  _globals['_ORDERRESPONSE']._serialized_end=376
  _globals['_PRODUCTINFOREQUEST']._serialized_start=378
  _globals['_PRODUCTINFOREQUEST']._serialized_end=418
  _globals['_PRODUCTINFORESPONSE']._serialized_start=420
  _globals['_PRODUCTINFORESPONSE']._serialized_end=491
  _globals['_SHOPSERVICE']._serialized_start=494
  _globals['_SHOPSERVICE']._serialized_end=756
# @@protoc_insertion_point(module_scope)
