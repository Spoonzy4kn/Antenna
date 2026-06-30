# Contributing to Antenna

Antenna is a pre-alpha open-source Android project. Contributions should preserve the project's principles: simple, efficient, responsive, practical, intuitive, transparent, maintainable, and consistent.

## Before contributing

Read the documentation in `docs/`, especially:

- `docs/01_vision.md`
- `docs/02_project_principles.md`
- `docs/03_scope_of_works.md`
- `docs/04_functional_requirements.md`
- `docs/08_architecture.md`
- `docs/20_implementation_backlog.md`

## Contribution rules

- Keep changes focused.
- Do not add features outside Version 1 scope without a decision log update.
- Do not introduce advertising, telemetry, or analytics by default.
- Do not add unnecessary permissions.
- Update documentation when behaviour changes.
- Record significant decisions in the decision log.

## Branch naming

```text
feature/<short-name>
fix/<short-name>
docs/<short-name>
chore/<short-name>
```

## Commit style

```text
feat: add local favourites repository
fix: handle empty community results
docs: expand privacy documentation
test: add settings tests
chore: update dependencies
```

## Pull requests

A pull request should include:

- Summary.
- Reason for change.
- Test notes.
- Screenshots for UI changes where useful.
- Privacy impact statement where relevant.
- Documentation updates where relevant.
