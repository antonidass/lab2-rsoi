#!/usr/bin/env bash
set -e

psql "user=postgres hostaddr=127.0.0.1 port=5431 password=postgres" < cars/create.sql
psql "user=postgres hostaddr=127.0.0.1 port=5431 password=postgres" < payments/create.sql
psql "user=postgres hostaddr=127.0.0.1 port=5431 password=postgres" < rentals/create.sql
psql "user=postgres hostaddr=127.0.0.1 port=5431 password=postgres" < cars/insert.sql