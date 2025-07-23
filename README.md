#!/bin/bash

export GIT_AUTHOR_NAME="Thiago Aldrin"
export GIT_COMMITTER_NAME="Thiago Aldrin"
export GIT_AUTHOR_EMAIL="tamdsilva@logatti.edu.br"
export GIT_COMMITTER_EMAIL="tamdsilva@logatti.edu.br"

# Formato do desenho (52 semanas x 7 dias = 364 dias)
# 0 = sem commit, 1 = com commit
drawing=(
  "000000000000000000000000000000000000000000000000000000000000"
  "000011100000000000000000000011111000000000000000000000000000"
  "000010001000000000000000000010001000000000000000000000000000"
  "000010001000000000000000000011111000000000000000000000000000"
  "000010001000000000000000000010000000000000000000000000000000"
  "000010001000000000000000000011111000000000000000000000000000"
  "000011100000000000000000000000000000000000000000000000000000"
)

start_date="2023-07-23" # começo da cobra
repo_dir="./pacman-graph"
mkdir -p "$repo_dir"
cd "$repo_dir"
git init

for week in {0..51}; do
  for day in {0..6}; do
    if [[ "${drawing[$day]:$week:1}" == "1" ]]; then
      date=$(date -d "$start_date +$((week * 7 + day)) days" +%Y-%m-%d)
      echo "Pac-Man $date" > file.txt
      git add file.txt
      GIT_AUTHOR_DATE="$date 12:00:00" GIT_COMMITTER_DATE="$date 12:00:00" git commit -m "chomp $date"
    fi
  done
done
